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
            System.out.println("");
        }
        
        // Printing the list with the 5 nodes:
        studentsList.print(studentsList.head);
        
        // Updating grad status of 2 students:
        System.out.print("Enter the student ID you want to update: ");
        int update1 = input.nextInt();
        
        studentsList.updateDetails(studentsList.head, update1);
        studentsList.print(studentsList.head);
        
        System.out.print("Enter the student ID you want to update: ");
        int update2 = input.nextInt();
        
        studentsList.updateDetails(studentsList.head, update2);
        studentsList.print(studentsList.head);
        
        // Swapping 3rd and 5th students:
        studentsList.swap(studentsList.head, 3, 5);
        System.out.println("");
        System.out.println("Linked List after swapping 3 with 5 is");
        studentsList.print(studentsList.head);
        
        // Creating second singlyLinkedList:
        SinglyLinkedList secondStudentsList = new SinglyLinkedList();
        
        System.out.println("Reading inputs for second linked list:\n");
        for(int i = 0; i < 3; i++){
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
            secondStudentsList.head = secondStudentsList.insertNode(secondStudentsList.head, stuNode);
            System.out.println("");
            System.out.println("");
        }
        
        studentsList.merge(studentsList.head, secondStudentsList.head);
        
        System.out.println("After merging the two linked lists:");
        studentsList.print(studentsList.head);
        
        input.close();
    }
    
}
