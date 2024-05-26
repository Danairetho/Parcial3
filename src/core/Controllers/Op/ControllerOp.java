/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Controllers.Op;

import core.Controllers.utils.Response;
import core.Controllers.utils.Status;

/**
 *
 * @author danao
 */
public class ControllerOp {
    
    public static Response controllerAdd (String number1, String number2, String operator, String result){
        return null;
        double num1,num2;
        try {
                num1 = Integer.parseInt(number1);
            } catch (NumberFormatException ex) {
                return new Response("Number1 must be numeric", Status.BAD_REQUEST);
            }
        try {
                num2 = Integer.parseInt(number2);
            } catch (NumberFormatException ex) {
                return new Response("Number2 must be numeric", Status.BAD_REQUEST);
            }
    }
}
