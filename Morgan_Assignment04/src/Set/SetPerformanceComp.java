/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Wyatt Morgan
 */
public class SetPerformanceComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testWithSize(1000);
        testWithSize(10000);
        testWithSize(1000000);
    }
    
    public static void testWithSize(int size){
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        
        Random random = new Random();
        
        // HashSet:
        long startTime = System.nanoTime();
        
        for (int i = 0; i < size; i++) {
            hashSet.add(random.nextInt());
        }
        
        long endTime = System.nanoTime();
        
        System.out.println("Time taken for HashSet: " + (endTime - startTime) + " ns");
        
        // LinkedHashSet:
        startTime = System.nanoTime();
        
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(random.nextInt());
        }
        
        endTime = System.nanoTime();
        
        System.out.println("Time taken for LinkedHashSet: " + (endTime - startTime) + " ns");
        
        // TreeSet:
        startTime = System.nanoTime();
        
        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt());
        }
        
        endTime = System.nanoTime();
        
        System.out.println("Time taken for TreeSet: " + (endTime - startTime) + " ns");
        
        System.out.println("**********************************");
    }
    
    /*
    Explanation:
    testWithSize generates random integers and measures the time it takes to insert them into each of the three sets.
    The System.nanoTime() function is used to mark the start and end times for each set's insertion process, 
    and the difference between the end and start times gives the execution time.
    The method is called three times for different sizes: 1000, 10,000, and 1,000,000 elements.
    HashSet seems to always be the fastest because it has O(n) with no ordering needed
    LinkedHashSet is second fastest because it has O(n) with no ordering needed BUT it has to maintain the doubly linked list
    TreeSet is the slowest because it has the insertion speed of O(log n)
    */
    
}
