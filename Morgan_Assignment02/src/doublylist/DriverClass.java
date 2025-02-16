/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylist;

import java.util.Scanner;

/**
 *
 * @author Wyatt Morgan
 */
public class DriverClass {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DoublyLinkedList doublylinkedlist = new DoublyLinkedList();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student ID: ");
            int sID = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();
            
            System.out.print("Enter last name: ");
            String lastName = input.nextLine();
            
            System.out.print("Enter student is graduated?: ");
            boolean grad = input.nextBoolean();
            
            System.out.print("Enter student age: ");
            int age = input.nextInt();
            input.nextLine();
            
            Node newNode = new Node(sID, firstName, lastName, grad, age);
            doublylinkedlist.head = doublylinkedlist.insertNode(doublylinkedlist.head, newNode);
            
            System.out.println("");
            System.out.println("");
        }
        
        doublylinkedlist.print(doublylinkedlist.head);
        doublylinkedlist.reverseList(doublylinkedlist.head);
        input.close();
    }
    
}
