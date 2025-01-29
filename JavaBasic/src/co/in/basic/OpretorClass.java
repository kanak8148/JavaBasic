package co.in.basic;

/**
 * OpretorClass mein operators aur variables ka use dikhaya gaya hai.
 * Yeh class simple arithmetic operation perform karti hai.
 */
public class OpretorClass {
    
    /**
     * main method program ka entry point hai. 
     * Ismein do variables `a` aur `b` declare kiye gaye hain. 
     * `b` ko `6 - a` ke expression se assign kiya jata hai, 
     * aur phir result ko print kiya jata hai.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // Variable `a` ko 4 se initialize kiya gaya hai
        int a = 4;
        
        // Variable `b` ko 6 se `a` ko subtract karke assign kiya gaya hai
        int b = 6 - a;
        
        // Console pe `b` ka value print ho raha hai
        System.out.println("b =" + b);
    }
}
