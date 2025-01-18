/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q1;

/**
 *
 * @author macintosh
 */
public class OtherDiscount implements DiscountPolicy{
   
    @Override
    public double computeDiscount(int count, double itemCost) {
        double discountRate = 0.0;
        if (count > 8){
            discountRate = 0.3;
        }
        else if (count >= 6){
            discountRate= 0.2;
        }
        else if (count >= 3){
            discountRate = 0.1;
        }
        return count * itemCost * discountRate;
    }
    
}
