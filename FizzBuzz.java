package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // Check for multiples of both 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // Check for multiples of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // Check for multiples of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // If not a multiple of 3 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }
}