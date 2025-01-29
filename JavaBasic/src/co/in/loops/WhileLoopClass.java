package co.in.loops;

/**
 * WhileLoopClass mein ek simple `while` loop ka use dikhaya gaya hai.
 * Is class mein ek loop chalaya gaya hai jo 1 se lekar 3 tak ke numbers ko print karega.
 */
public class WhileLoopClass {
    
    /**
     * main method program ka entry point hai.
     * Yaha par `while` loop use kiya gaya hai jo tab tak chalega jab tak condition 
     * (i <= 3) true hai. Har iteration mein `i` ki value print ki jayegi aur 
     * phir `i` ko increment kiya jayega.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // `i` ko 1 se initialize kiya gaya hai
        int i = 1;
        
        // While loop jab tak `i` ki value 3 se kam ya barabar hai, tab tak chalega
        while (i <= 3) {
            // Har iteration mein `i` ka value print hoga
            System.out.println(i);
            
            // `i` ki value ko increment karte hain
            i++;
        }
    }
}
