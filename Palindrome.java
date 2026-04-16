package palindrome; // This line fixes the "Could not find or load main class" error

public class Palindrome {
    public static void main(String[] args) {

        int num = 121;  // You can change this to test other numbers
        int original = num;
        int reverse = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Output the result
        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
    }
}