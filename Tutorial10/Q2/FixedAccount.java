/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q2;

/**
 *
 * @author macintosh
 */
public class FixedAccount implements Interest {
    public double balance;
    
    public FixedAccount (double fa){
        balance = fa;
    }
    @Override
    public double computeInterest(double balance) {
        return balance * (3.0/100);
    }
}
