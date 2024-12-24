/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.Tutorial8.Q3;

/**
 *
 * @author macintosh
 */
public class coordinate {   
    private int x, y; //instance variables
    
    public coordinate (){ //no-argument constructors
        x = 0;
        y = 0;  
    }
    public coordinate (int a, int b){ //constructors
        x = a;
        y = b;
    } 
    public void setX (int a){ //mutator method
        x = a;
    }
    public void setY (int b){
        y = b;
    }
    public int getX (){ //accessor method
        return x;
    }
    public int getY (){
        return y;
    }   
    
    public void method (){ //output method
        System.out.println("The coordinate are (" + x + "," + y + ")");
    }
}
