/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q2;

/**
 *
 * @author macintosh
 */
public class SavingAccount implements Interest {
    private double balance;
    
    public SavingAccount (double sa){
        balance = sa;
    }
    
    @Override
    public double computeInterest(double balance) {
        return balance * (0.5/100);
    }
}
