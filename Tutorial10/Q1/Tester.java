/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q1;

/**
 *
 * @author macintosh
 */
public class Tester {
    public static void main (String [] args){
        double cost = 35.5;
        int cnt = 4;
        BulkDiscount bd = new BulkDiscount(3, 20); //(minimum, discountRate)
        //dia ada constructor with parameter
	OtherDiscount od = new OtherDiscount(); //based on table
        //takde constructor so ()
        
        System.out.println("Item cost : " + cost);
        System.out.println("Quantity : " + cnt);
        System.out.println("Bulk discount : " + bd.computeDiscount(cnt, cost));
        
        System.out.printf("Other discount : %.2f \n", od.computeDiscount(cnt, cost));
	combineDiscount cd = new combineDiscount(bd, od);
        //compare bd and od mana lagi banyak
	System.out.printf("Combine Discount : %.2f \n", cd.computeDiscount(cnt, cost));
    }
}
