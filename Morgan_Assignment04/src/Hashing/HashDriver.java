/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashing;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Wyatt Morgan
 */
public class HashDriver {
    static int collision = 0;
    
    static String[] arr1 = new String[31];
    
    public static void main(String[] args){
        Random random = new Random();
        Set<Integer> set1 = new HashSet<>();
        
        arrayInitialize();
        
        while(set1.size() < 1000){
            set1.add(random.nextInt(10000));
        }
        
        for(int val: set1){
            hashing(val);
        }
        
        System.out.println("Total collisions: " + collision);
        System.out.println("Hash table with chaining:");
        
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Index " + i + " : " + arr1[i]);
        }
    }
    
    public static void arrayInitialize(){
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = "";
        }
    }
    
    public static void hashing(int val){
        int index = val % 31;
        
        if (arr1[index].equals("")) { 
            arr1[index] = String.valueOf(val);
        }
        else {
            collision++;
            arr1[index] += ", " + val;
        }
    }
    
    /* Reflection:
        the high number of collisions is due to the array being small (of size 31) but trying to take in 1000 values
        other than that the rest of the code and output makes sense because it is adding 31 random values to the array and chaining them if there are collisions.
    */
}
