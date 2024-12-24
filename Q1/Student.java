/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.Tutorial8.Q1;

/**
 *
 * @author macintosh
 */
public class Student { //a
    private String contactNumber; //b
    
    public Student (){ //c
        this.contactNumber = null; 
    }    
    public Student (String contactNumber){ //d
        this.contactNumber = contactNumber;
    } 
    public String getContact (){ //e
        return contactNumber;
    }
    public void setContact (String c){
        this.contactNumber = c;
    }
    public void output (){ //f
        System.out.println("The contact number is " + contactNumber);
    } 
}
