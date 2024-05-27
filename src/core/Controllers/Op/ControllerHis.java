/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Controllers.Op;

import calculator.History;
import calculator.Operation;
import core.Controllers.utils.Response;
import core.Controllers.utils.Status;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author danao
 */
public class ControllerHis {
    private History history;
    
    public ControllerHis(History history) {
        this.history = history;
    }
    
    public static Response updateHis() {
        try {
            History history = History.getInstance();
            if (history.getOperations().isEmpty()) {
                return new Response("There is no history", Status.NOT_FOUND);
            }
            
            ArrayList<Operation> operationHistory = new ArrayList<>(history.getOperations()); 
            Collections.reverse(operationHistory);

            DefaultListModel model = new DefaultListModel();
            model.addAll(operationHistory);
            
            return new Response("History updated", Status.OK, model);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
        
    
    public ArrayList<Operation> getOperationsInReverseOrder() {
        ArrayList<Operation> operations = new ArrayList<>(history.getOperations());
        Collections.reverse(operations);
        return operations;
    }
}
