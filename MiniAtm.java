import java.util.Scanner;

public class MiniAtm {

    static double balance = 1000; // initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    depositAmount(deposit);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    withdrawAmount(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM 😊");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to deposit money
    public static void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully ✅");
        } else {
            System.out.println("Invalid Amount ❌");
        }
    }

    // Method to withdraw money
    public static void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash 💸");
        } else {
            System.out.println("Insufficient Balance ❌");
        }
    }
}