package co.in.basic;

/**
 * StringMethodClass mein String ke kuch common methods ka use dikhaya gaya hai.
 * Is class mein String ko manipulate karne ke liye kuch methods (jaise length, toLowerCase, trim, etc.) 
 * ko comment ke through demonstrate kiya gaya hai.
 */
public class StringMethodClass {
    /**
     * main method program ka entry point hai.
     * Ismein kuch String methods ko use karne ka example diya gaya hai jo String ke manipulation 
     * mein madad karte hain, lekin abhi sabhi methods ko comment kiya gaya hai.
     *
     * @param args Command line arguments (yaha is method mein use nahi ho rahe).
     */
    public static void main(String[] args) {
        
        // `name` ko new String object ke through "Kanak" se initialize kiya gaya hai
        String name = new String("Kanak");
        
        // `name2` ko "kanak" ke saath extra spaces ke saath initialize kiya gaya hai
        String name2 = new String("          kanak");
        
        // Example: String ki length ko print karta hai
        // System.out.println(name.length());
        
        // Example: String ko lower case mein convert karta hai
        // System.out.println(name.toLowerCase());
        
        // Example: String ko upper case mein convert karta hai
        // System.out.println(name2.toUpperCase());
        
        // Example: String ke leading aur trailing spaces ko remove karta hai
        // System.out.println(name2.trim());
        
        // Example: String ka substring ko print karta hai, starting index se
        // System.out.println(name.substring(2));
        
        // Example: String ka specific range ke beech ka substring print karta hai
        // System.out.println(name.substring(2, 4));
        
        // Example: String mein kisi character ko replace karta hai
        // System.out.println(name.replace("k", "s"));
        
        // Example: Check karta hai ki string kisi specific prefix se start hota hai ya nahi
        // System.out.println(name.startsWith("S"));
    }
}
