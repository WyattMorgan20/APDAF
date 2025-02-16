/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylist;

/**
 *
 * @author Wyatt Morgan
 */
public class DoublyLinkedList {
    
    public Node head;
    
    public Node insertNode(Node head, Node newNode){
        if(head == null){
            this.head = newNode;
            return this.head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;
        return this.head;
        
    }
    
    public void print(Node head){
        Node temp = head;
        System.out.println("******************************************");
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.println("The student ID is: " + temp.std_ID);
            System.out.println("First Name: " + temp.firstName);
            System.out.println("Last Name: " + temp.lastName);
            System.out.println("isGraduated: " + temp.isGradOrNot);
            System.out.println("Age: " + temp.age);
            System.out.println("******");
            temp = temp.next;
        }
       
    }
    
    public void reverseList(Node head){
        System.out.println("***********************************");
        System.out.println("The linked list printed in reverse order is");
        Node temp = head;
        
        if(temp == null){
            return;
        }
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        while(temp != null){
            System.out.println("The student ID is: " + temp.std_ID);
            System.out.println("First Name: " + temp.firstName);
            System.out.println("Last Name: " + temp.lastName);
            System.out.println("isGraduated: " + temp.isGradOrNot);
            System.out.println("Age: " + temp.age);
            System.out.println("******");
            
            temp = temp.previous;
        }
        
    }
}
