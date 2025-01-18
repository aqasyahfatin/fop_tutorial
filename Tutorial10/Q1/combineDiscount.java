/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q1;

/**
 *
 * @author macintosh
 */
public class combineDiscount implements DiscountPolicy{
    private DiscountPolicy dp1;
    private DiscountPolicy dp2;
    
    public combineDiscount (DiscountPolicy a, DiscountPolicy b){
        dp1 = a;
        dp2 = b;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost) {
        return (Math.max(dp1.computeDiscount(count, itemCost), dp2.computeDiscount(count, itemCost)));
    }
}
