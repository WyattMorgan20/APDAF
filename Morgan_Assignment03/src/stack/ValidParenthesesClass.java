/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;
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
        
        if (bracesChecker(userInput)) {
            System.out.println("The braces are closed correctly.");
        } else {
            System.out.println("The braces aren't closed correctly.");
        }
        
    }
    
    // method to check if braces are closing and/or opening, then proceeding accordingly
    private static boolean bracesChecker(String input) {
        Stack<String> tempStack = new Stack<>();
        
        for (char ch : input.toCharArray()) {
            String strChar = String.valueOf(ch);

            if ("({[".contains(strChar)) {
                tempStack.push(strChar);
            }
            else if (")}]".contains(strChar)) {
                if (tempStack.isEmpty()) {
                    return false;
                }
                String openBrace = tempStack.pop();
                if (!pairChecker(openBrace, strChar)) {
                    return false;
                }
            }
        }
        
        return tempStack.isEmpty();
    }
    
    // method to check if braces are properly paired/closed correctly
    private static boolean pairChecker(String opener, String closer) {
        return (opener.equals("(") && closer.equals(")")) ||
               (opener.equals("[") && closer.equals("]")) ||
               (opener.equals("{") && closer.equals("}"));
    }
    
    // input test cases:
    // [(a+b)-3%6-{12/45}*(c-d)]
    // [{a+b}-{5*9}-((c+d)]
    // []{{}}())
}
