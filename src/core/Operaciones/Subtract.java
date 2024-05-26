/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Operaciones;

import core.Interfaz.InterfaceOp;

/**
 *
 * @author danao
 */
public class Subtract implements InterfaceOp {

    public Subtract() {
    }

    @Override
    public double resultado(double number1, double number2) {
        return number1 - number2;
    }
    
}
