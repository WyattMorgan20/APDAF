/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Wyatt Morgan
 */
public class Driver {
    
    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<>();
        
        while(numberList.size() < 15){
            int num = random(100, 150);
            if(!numberList.contains(num)){
                numberList.add(num);
            }
        }
        System.out.println("Initial random numbers in numberList ArrayList:");
        System.out.println(numberList);
        System.out.println("Size of the numberList: " + numberList.size());
        System.out.println(" ");
        
        ArrayList<Integer> arrayIndex = new ArrayList<>();
        
        for(int i = 0; i < 15; i++){
            arrayIndex.add(random(1, 50));
            numberList.set(random(0, 14), arrayIndex.get(i));
        }
        System.out.println("Initial random numbers in arrayIndex ArrayList:");
        System.out.println(arrayIndex);
        System.out.println("Size of the arrayIndex: " + arrayIndex.size());
        System.out.println(" ");
        
        System.out.println("updated random numbers in numberList ArrayList:");
        System.out.println(numberList);
        System.out.println("Size of the numberList: " + numberList.size());
        System.out.println(" ");
        
        for(int i = 0; i < 7; i++){
            if(!numberList.isEmpty()){
                numberList.remove(random(0, numberList.size() - 1));
            }
        }
        
        System.out.println("NumberList ArrayList after removing 7 numbers:");
        System.out.println(numberList);
        System.out.println("Size of the numberList: " + numberList.size());
        System.out.println(" ");
        
        ArrayList<Integer> tempArr = new ArrayList<>();
        
        for(int i = 0; i < 8; i++){
            tempArr.add(random(150, 200));
            while(numberList.size() < 15){
                numberList.add(random(0, numberList.size() - 1), tempArr.get(i));
            }
            
        }
        
        System.out.println("NumberList ArrayList after adding numbers:");
        System.out.println(numberList);
        System.out.println("Size of the numberList: " + numberList.size());
        System.out.println(" ");
        
    }
    
    public static int random(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
}
