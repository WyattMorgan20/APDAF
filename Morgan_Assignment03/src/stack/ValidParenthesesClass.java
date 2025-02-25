/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Wyatt Morgan
 */
public class ValidParenthesesClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any string: ");
        String userInput = input.nextLine();
        
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        Stack<String> braces = new Stack<>();
        
        for(int i = 0; i < userInput.length(); i++){
            char ch = userInput.charAt(i);
            String userInputStr = String.valueOf(ch);
            if(Character.isLetterOrDigit(ch)){
                operands.push(userInputStr);
            }
            else if("+-*/%".contains(userInputStr)){
                operators.push(userInputStr);
            }
            else if("()[]{}".contains(userInputStr)){
                braces.push(userInputStr);
            }
        }
        
        System.out.println("\nOperands stack: " + operands);
        System.out.println("Operators stack: " + operators);
        System.out.println("Braces stack: " + braces);
        
        
    }
    
}
