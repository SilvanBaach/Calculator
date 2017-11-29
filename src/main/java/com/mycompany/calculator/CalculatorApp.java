/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author 5im15sibaach
 */
public class CalculatorApp {
    private static Calculator c = new Calculator();
    
    
    public static void main(String[] args) {
        String eingabe ="";
        String eingabe2 = "";
        Scanner sc  = new Scanner(System.in);
        
        while(!eingabe.equalsIgnoreCase("quit")){
            System.out.println("Geben Sie eine Zahl ein:");
            eingabe = sc.next();
            if(!eingabe.equalsIgnoreCase("quit")){
            System.out.println("Geben Sie eine zweite Zahl ein:");
            eingabe2= sc.next();
            System.out.println("Das Resultat ist: " + c.addition(Integer.parseInt(eingabe), Integer.parseInt(eingabe2)));
            }
        }
    }
}
