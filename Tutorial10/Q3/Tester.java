/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial.Tutorial10.Q3;
import java.util.Arrays;
/**
 *
 * @author macintosh
 */
public class Tester {
    public static void main (String [] args){
        Person [] p = new Person [6];
        p[0] = new Person ("Daphne");
        p[1] = new Person ("Anthony");
        p[2] = new Person ("Benedict");
        p[3] = new Person ("Elloise");
        p[4] = new Person ("Francessa");
        p[5] = new Person ("Colin");
        
        System.out.println("Lists of persons : ");
        for (int i=0; i<6; i++){
            System.out.print(p[i].getName() + ", ");
        }
        
        Arrays.sort(p);
        
        System.out.println();
        System.out.println("\nList of persons by ascending order : ");
        for (Person person : p){
            person.Display();
        }
        
        
    }
}
