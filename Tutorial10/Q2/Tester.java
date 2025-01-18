/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q2;

/**
 *
 * @author macintosh
 */
public class Tester {
    public static void main (String [] args){
        
        double balance = 5240.50;
        SavingAccount sa = new SavingAccount(balance);
        FixedAccount fa = new FixedAccount(balance);
         
        System.out.println("Balance account : " + balance);
        System.out.printf("Interest in saving account : %.2f \n", sa.computeInterest(balance));
        System.out.printf("Interest in fixed account : %.2f \n", fa.computeInterest(balance));
    }
}
