/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

import java.util.Scanner;

/**
 *
 * @author Wyatt Morgan
 */
public class ListDriver {
    
    public static void main(String[] args){
        SinglyLinkedList studentsList = new SinglyLinkedList();
        
        Scanner input = new Scanner(System.in);
        
        // Adding 5 nodes
        for(int i = 0; i < 5; i++){
            System.out.print("Enter student ID: ");
            int sID = input.nextInt();
            input.nextLine();
            
            System.out.print("\nEnter first name: ");
            String firstName = input.nextLine();
            
            System.out.print("\nEnter last name: ");
            String lastName = input.nextLine();
            
            System.out.print("\nEnter student is graduated?: ");
            boolean grad = input.nextBoolean();
            
            System.out.print("\nEnter student age: ");
            int age = input.nextInt();
            
            Node stuNode = new Node(sID, firstName, lastName, grad, age);
            studentsList.head = studentsList.insertNode(studentsList.head, stuNode);
            System.out.println("");
        }
        
        // Printing the list with the 5 nodes:
        studentsList.print(studentsList.head);
        
        // Updating grad status of 2 students:
        
    }
    
}
