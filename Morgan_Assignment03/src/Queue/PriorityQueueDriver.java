/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.PriorityQueue;

/**
 *
 * @author Wyatt Morgan
 * Assignment 03 Part 2
 */
public class PriorityQueueDriver {
    
    public static void main(String[] args){
        
        PriorityQueue<Person> pqueue = new PriorityQueue<>();
        
        pqueue.add(new Person("Faculty", "Prof. Johnson", 4, "Submit grades"));
        pqueue.add(new Person("Student", "Alice", 1, "Need help with assignment"));
        pqueue.add(new Person("Faculty", "Dr. Smith", 3, "Schedule meeting for research"));
        pqueue.add(new Person("Staff", "David", 2, "Organize department event"));
        pqueue.add(new Person("Student", "Charlie", 1, "Request for leave"));
        pqueue.add(new Person("Staff", "Bod", 2, "Fix the lab computer"));
        
        System.out.println("Processing messages in priority order:");
        
        while(!pqueue.isEmpty()){
            System.out.println(pqueue.poll());
        }
        
    }
    
}
