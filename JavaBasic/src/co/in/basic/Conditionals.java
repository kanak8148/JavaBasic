package co.in.basic;

/**
 * Conditionals class mein simple conditional statement (if-else) ka use dikhaya gaya hai.
 * Is class mein `age` variable ke basis pe check kiya gaya hai ki user driving ke liye eligible hai ya nahi.
 */
public class Conditionals {
    
    /**
     * main method program ka entry point hai.
     * Yaha par `age` variable ke basis pe if-else condition check ki gayi hai.
     * Agar `age` 18 se zyada hai, toh user ko driving ke liye allow kiya jayega,
     * aur agar age 18 se kam hai, toh driving allowed nahi hoga.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // Age ko 6 set kiya gaya hai
        int age = 6;
        
        // Agar age 18 se zyada hai, toh user ko driving allow hoga
        if (age > 18) {
            System.out.println("yes you can drive");
        } else {
            // Agar age 18 ya usse kam hai, toh user ko driving allowed nahi hoga
            System.out.println("you do not drive");
        }
    }
}
