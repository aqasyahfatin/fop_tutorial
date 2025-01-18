/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q1;

/**
 *
 * @author macintosh
 */
public class BulkDiscount implements DiscountPolicy {
    // bila dia implement abstract method dalam dp, maksudnya like kita nak guna
    // so akan ada this override using the same method name but we decide dalam dia
    
    private final int minimum; //final because it is given a table
    private final double discountRate;
    
    public BulkDiscount (int min, double dr){ //constructor
        minimum = min;
        discountRate = dr;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum){
            return count * itemCost * discountRate/100;
        }
        return 0;
    }
}
