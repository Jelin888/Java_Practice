package stringreverse; // Matches the folder NetBeans created

public class StringReverse { // Matches the class name NetBeans is looking for
    public static void main(String[] args) {

        String str = "hello";
        
        // Using StringBuilder to reverse the string efficiently
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}