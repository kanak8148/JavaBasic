package co.in.basic;

import java.util.Scanner;

/**
 * Ye class user se input lene ke liye Scanner ka use karti hai.
 * Program do numbers ke sum ko calculate karega jo user input karega.
 * 
 * @author KanakSoni
 * @version 3.1
 */
public class ScannerClass {
    
    /**
     * Ye main method hai jo user se do numbers leta hai aur unka sum calculate karke print karta hai.
     *
     * @param args command-line arguments, jo yahan use nahi kiye ja rahe hain
     */
    public static void main(String[] args) {
        // User se input lene ka message
        System.out.println("Taking Input From User With help of scanner ");
        
        // Scanner object banaya gaya user input lene ke liye
        Scanner sc = new Scanner(System.in);
        
        // First number input lene ke liye
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        
        // Second number input lene ke liye
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        
        // Do numbers ka sum calculate kiya gaya
        int sum = a + b;
        
        // Result print karne ke liye
        System.out.println("The sum of these numbers is ");
        System.out.println(sum);
    }
}
