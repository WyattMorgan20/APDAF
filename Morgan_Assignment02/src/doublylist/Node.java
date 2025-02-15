/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylist;

/**
 *
 * @author Wyatt Morgan
 */
public class Node {
    int std_ID;
    String firstName;
    String lastName;
    boolean isGradOrNot;
    int age;
    Node next;
    Node previous;
    
    public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age){
        this.std_ID = std_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGradOrNot = isGradOrNot;
        this.age = age;
    }
    
    public Node(){
        
    }
}
