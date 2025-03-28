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
    
    static int[] arr1 = new int[31];
    
    public static void main(String[] args){
        Random random = new Random();
        Set<Integer> set1 = new HashSet<>();
        
        arrayInitialize();
        
        while(set1.size() < 1000){
            set1.add(random.nextInt(1000));
        }
        
        for(int val: set1){
            hashing(val);
        }
        
        System.out.println("Total collisions: " + collision);
    }
    
    public static void arrayInitialize(){
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = -1;
        }
    }
    
    public static void hashing(int val){
        int index = val % 31;
        
        if(arr1[index] == -1){
            arr1[index] = val;
        }
        else{
            collision++;
            while(arr1[index] != -1){
                index = (index + 1) % 31;
            }
            
            arr1[index] = val;
        }
    }
}
