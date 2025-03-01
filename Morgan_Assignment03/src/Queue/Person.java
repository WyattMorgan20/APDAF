/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Wyatt Morgan
 */
public class Person implements Comparable {
    
    String role;
    String name;
    int priority;
    String message;
    
    public Person(String role, String name, int priority, String message){
        this.role = role;
        this.name = name;
        this.priority = priority;
        this.message = message;
    }
    
    
    @Override
    public int compareTo(){
        
    }
}
