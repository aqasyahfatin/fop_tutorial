/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.Tutorial8.Q5;

/**
 *
 * @author macintosh
 */
public class Connection {
    private static int cnn = 0;
    
    public Connection(){
        cnn++;
    }
    public void Disconnect(){
        cnn--;
    }
    public void display(){
        System.out.println("The number of connection is " + cnn);
    }
}
