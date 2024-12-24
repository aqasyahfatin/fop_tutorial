/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.Tutorial8.Q4;

/**
 *
 * @author macintosh
 */
public class Payment {
    public double amount;
    public String chequeNumber, cardholderName, cardType, expirationDate, validationCode;
    
    public void payBy (double a){
        amount = a;
        System.out.println("Total pay by cash is " + amount);
    }
    public void payBy (double a, String s){
        amount = a;
        chequeNumber = s;
        System.out.println("Total pay by cash is " + amount);
        System.out.println("The cheque number is " + chequeNumber);
    }
    public void payBy (double a, String n, String t, String e, String v){
        amount = a;
        cardholderName = n;
        cardType = t;
        expirationDate = e;
        validationCode = v;
        System.out.println("Total pay by cash is " + amount);
        System.out.println("The card holder name is " + cardholderName);
        System.out.println("The card type is : " + cardType);
        System.out.println("The expiration date is " + expirationDate);
        System.out.println("The validation code is " + validationCode);
    }
}
