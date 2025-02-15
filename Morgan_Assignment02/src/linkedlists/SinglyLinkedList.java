/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Wyatt Morgan
 */
public class SinglyLinkedList {
    
    public Node insertNode(Node head, Node newNode){
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    
    public Node updateDetails(Node head, int studentID){
        Node temp = head;
        while(temp != null){
            if(temp.std_ID == studentID){
                temp.isGradOrNot = !temp.isGradOrNot;
                return head;
            }
            temp = temp.next;
        }
        
        return head; 
    }
    
    public void print(Node head){
        Node temp = head;
        System.out.println("******************************************");
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
    
    public Node swap(Node head, int stuID1, int stuID2){
        if(head == null || stuID1 == stuID2){
            return head;
        }
        
        Node prev1 = null;
        Node prev2 = null;
        Node tempNode1 = head;
        Node tempNode2 = head;
        
        while(tempNode1 != null && tempNode1.std_ID != stuID1) {
            prev1 = tempNode1;
            tempNode1 = tempNode1.next;
        }
        while(tempNode2 != null && tempNode2.std_ID != stuID2) {
            prev2 = tempNode2;
            tempNode2 = tempNode2.next;
        }

        if(tempNode1 == null || tempNode2 == null){
            return head;
        }

        if (prev1 != null){
            prev1.next = tempNode2;
        }
        else{
            head = tempNode2;
        }

        if(prev2 != null){
            prev2.next = tempNode1;
        }
        else{
            head = tempNode1;
        }

        Node temp = tempNode1.next;
        tempNode1.next = tempNode2.next;
        tempNode2.next = temp;
        
        return head;
    }
    
    public Node merge(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        
        Node tempNode = head1;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        
        tempNode.next = head2;
        return head1;
    }
    
}
