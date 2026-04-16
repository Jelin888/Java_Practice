package oddeven; // Ensure this matches your actual folder name!

public class OddorEven { // This MUST match the filename exactly
    public static void main(String[] args) {

        int num = 7; 

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}