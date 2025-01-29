package co.in.loops;

/**
 * ForLoopClass mein ek simple `for` loop ka use dikhaya gaya hai.
 * Is class mein `for` loop ke through numbers ko print kiya gaya hai.
 * Loop mein increment ka use kiya gaya hai, jisme `i` ki value ko har iteration ke baad increase kiya jata hai.
 */
public class ForLoopClass {

    /**
     * main method program ka entry point hai.
     * Ismein ek `for` loop use kiya gaya hai jo 1 se lekar 10 tak numbers print karega.
     * Har iteration ke baad `i` ki value ko 1 se increment kiya jata hai.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // `for` loop start ho raha hai, jisme `i` ki value 1 se start hogi
        // aur har iteration mein `i` ko 1 increment kiya jayega jab tak `i` 10 se zyada na ho
        for (int i = 1; i <= 10; i++) {
            // Har iteration mein `i` ki value print ki jayegi
            System.out.println(i);
        }
    }
}
