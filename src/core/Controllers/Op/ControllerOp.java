/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Controllers.Op;

import calculator.History;
import calculator.Operation;
import core.Controllers.utils.Response;
import core.Controllers.utils.Status;
import core.Operaciones.Addition;
import core.Operaciones.Division;
import core.Operaciones.Multiply;
import core.Operaciones.Power;
import core.Operaciones.Subtract;

/**
 *
 * @author danao
 */
public class ControllerOp {
    
    public static boolean validarPunto(String numero) {
                int contadorPuntos = 0;
                for (char c : numero.toCharArray()) {
                    if (c == '.') {
                        contadorPuntos++;
                    }
                    if (contadorPuntos > 1) {
                        return false;
                    }
                }
                return contadorPuntos == 1;
            }
    
    public static boolean ValidarNDecimales(String numero) {
                int indexPunto = numero.indexOf('.');
                if (indexPunto >= 0) {
                    int longitudParteDecimal = numero.length() - indexPunto - 1;
                    return longitudParteDecimal > 3;
                }
                return false;
            }
    
    public static Response controllerAdd (String number1, String number2, String operator, History history){
        
        try{
            double num1,num2;
            try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException ex) {
                    return new Response("Number1 must be numeric", Status.BAD_REQUEST);
                }
            try {
                    num2 = Double.parseDouble(number2);
                } catch (NumberFormatException ex) {
                    return new Response("Number2 must be numeric", Status.BAD_REQUEST);
                }

            if (number1.equals("")) {
                    return new Response("Number1 must be not empty", Status.BAD_REQUEST);
                }

            if (number2.equals("")) {
                    return new Response("Number2 must be not empty", Status.BAD_REQUEST);
                }
            
            if (operator.equals("")) {
                    return new Response("operator must be not empty", Status.BAD_REQUEST);
                }
            
        
            if (ValidarNDecimales(number1)) {
                return new Response("Number1 must have not more than 3 decimals", Status.BAD_REQUEST);
            }
        
            if (ValidarNDecimales(number2)) {
                return new Response("Number2 must have not more than 3 decimals", Status.BAD_REQUEST);
            }
        
            if (!validarPunto(number1)) {
                return new Response("Number1 must have only 1 point", Status.BAD_REQUEST);
            }
        
            if (!validarPunto(number2)) {
                return new Response("Number2 must have only 1 point", Status.BAD_REQUEST);
            }
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
            
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    
    public static Response controllerSub (String number1, String number2, String operator, History history){
        
        try{
            double num1,num2;
            try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException ex) {
                    return new Response("Number1 must be numeric", Status.BAD_REQUEST);
                }
            try {
                    num2 = Double.parseDouble(number2);
                } catch (NumberFormatException ex) {
                    return new Response("Number2 must be numeric", Status.BAD_REQUEST);
                }

            if (number1.equals("")) {
                    return new Response("Number1 must be not empty", Status.BAD_REQUEST);
                }

            if (number2.equals("")) {
                    return new Response("Number2 must be not empty", Status.BAD_REQUEST);
                }
            
            if (operator.equals("")) {
                    return new Response("operator must be not empty", Status.BAD_REQUEST);
                }
            
            Subtract subtract = new Subtract();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,subtract.resultado(num1, num2)));
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response controllerMult(String number1, String number2, String operator,History history){
        
        try{
            double num1,num2;
            try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException ex) {
                    return new Response("Number1 must be numeric", Status.BAD_REQUEST);
                }
            try {
                    num2 = Double.parseDouble(number2);
                } catch (NumberFormatException ex) {
                    return new Response("Number2 must be numeric", Status.BAD_REQUEST);
                }

            if (number1.equals("")) {
                    return new Response("Number1 must be not empty", Status.BAD_REQUEST);
                }

            if (number2.equals("")) {
                    return new Response("Number2 must be not empty", Status.BAD_REQUEST);
                }
            
            if (operator.equals("")) {
                    return new Response("operator must be not empty", Status.BAD_REQUEST);
                }
            
            
            Multiply multiply = new Multiply();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,multiply.resultado(num1, num2)));
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response ControllerPow(String number1, String number2, String operator,History history){
        
        try{
            double num1,num2;
            try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException ex) {
                    return new Response("Number1 must be numeric", Status.BAD_REQUEST);
                }
            try {
                    num2 = Double.parseDouble(number2);
                } catch (NumberFormatException ex) {
                    return new Response("Number2 must be numeric", Status.BAD_REQUEST);
                }

            if (number1.equals("")) {
                    return new Response("Number1 must be not empty", Status.BAD_REQUEST);
                }

            if (number2.equals("")) {
                    return new Response("Number2 must be not empty", Status.BAD_REQUEST);
                }
            
            if (operator.equals("")) {
                    return new Response("operator must be not empty", Status.BAD_REQUEST);
                }
            
            
           Power power = new Power();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,power.resultado(num1, num2)));
                        
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response ControllerDiv (String number1, String number2, String operator, History history){
        try{
            double num1,num2;
            try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException ex) {
                    return new Response("Number1 must be numeric", Status.BAD_REQUEST);
                }
            try {
                    num2 = Double.parseDouble(number2);
                } catch (NumberFormatException ex) {
                    return new Response("Number2 must be numeric", Status.BAD_REQUEST);
                }

            if (number1.equals("")) {
                    return new Response("Number1 must be not empty", Status.BAD_REQUEST);
                }

            if (number2.equals("")) {
                    return new Response("Number2 must be not empty", Status.BAD_REQUEST);
                }
            
            if (operator.equals("")) {
                    return new Response("operator must be not empty", Status.BAD_REQUEST);
                }
            
            if (number2.equals("0")) {
                    return new Response("Can not divided by 0", Status.BAD_REQUEST);
                }
            
            
            Division division = new Division();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,division.resultado(num1, num2)));
                        
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
