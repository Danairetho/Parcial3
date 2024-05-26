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
public class Power implements InterfaceOp {

    public Power() {
    }

    @Override
    public double resultado(double number1, double number2) {
        return Math.pow(number1, number2);
    }
    
}
