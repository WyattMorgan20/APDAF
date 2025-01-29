/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wyatt Morgan
 */
public class Array {
    
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
    
        Random random = new Random();
        int min = 25;
        int max = 50;
        int randInt = 0; 
        
        System.out.print("Array 1: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = random(min, max);
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("Array 2: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = random(min, max);
            System.out.print(arr2[i] + " ");
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the sum : ");
        int sum = input.nextInt();
        
        findPairsWithSum(arr1, arr2, sum);
    }
    
    public static int random(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
    public static void findPairsWithSum(int[] arr1, int[] arr2, int sum){
        int count = 1;
        boolean pairs = false;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] + arr2[j] == sum){
                    System.out.println("pair " + count + ": (" + arr1[i] + "," + arr2[j] + ")");
                    count++;
                    pairs = true;
                }
            }
        }
        
        if(pairs == false){
            System.out.println("No pair Found");
        }
    }
}
