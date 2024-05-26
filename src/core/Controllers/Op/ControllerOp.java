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

/**
 *
 * @author danao
 */
public class ControllerOp {
    
    public static Response controllerAdd (String number1, String number2, String operator, String result, History history){
        
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
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
            
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response controllerSub (String number1, String number2, String operator, String result,History history){
        
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
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response controllerMult(String number1, String number2, String operator, String result,History history){
        
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
            
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
            
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response ControllerMult(String number1, String number2, String operator, String result,History history){
        
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
            
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
                        
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response ControllerDiv (String number1, String number2, String operator, String result, History history){
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
            
            
            Addition addition = new Addition ();
            
            history.addOperation(new Operation(Double.parseDouble(number1), Double.parseDouble(number2), operator,addition.resultado(num1, num2)));
                        
            return new Response("Operation successfully", Status.CREATED);
            
            
        }catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}