package co.in.loops;

/**
 * DoWhileLoopClass mein ek simple `do-while` loop ka use dikhaya gaya hai.
 * Is class mein loop ka use kiya gaya hai jisme pehle ek baar statement execute hoti hai, 
 * phir condition check hoti hai. Yaha loop mein `b` ki value ko print kiya gaya hai aur increment kiya gaya hai.
 */
public class DoWhileLoopClass {
    
    /**
     * main method program ka entry point hai.
     * Yaha par `do-while` loop ka use kiya gaya hai. Pehle `b` ki value print hogi,
     * aur phir `b` ko increment kiya jayega. Condition `b < 5` ke liye check hogi 
     * lekin `do-while` loop mein statement pehle execute hota hai aur fir condition check hoti hai.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // `b` ko 10 se initialize kiya gaya hai
        int b = 10;
        
        // Do-while loop ke through pehle statement execute hoga, fir condition check hoga
        do {
            // `b` ki value print ki jayegi
            System.out.println(b);
            
            // `b` ko increment kiya jayega
            b++;
        } while (b < 5);  // Condition check hota hai, lekin do-while loop pehle statement execute karne ke baad condition check karta hai
    }
}
