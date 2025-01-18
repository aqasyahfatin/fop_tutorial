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
public class Person implements Comparable<Person>{

    private String name;
    
    public Person (String name){
        this.name = name;
    }
    
    public String getName (){
        return name;
    }

    public void Display (){
        System.out.print(name + ", ");
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    
}
