/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.Tutorial8.Q2;

/**
 *
 * @author macintosh
 */
public class Digit { //a
    private int num; //b
    
    public Digit(int n){ //c
    num = n;
    } //1234
    
    public int digitMultiplication (){ //d
        int multi = 1;
        while (num>0){
            multi *= (num%10);
            num /= 10;
        }
        return multi;
    }
    public void displayMultiplication (){ //e
        System.out.println("The digit multiplication of the " + num + " : " + digitMultiplication());
    }   
}   

