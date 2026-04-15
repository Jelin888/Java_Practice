import java.util.Scanner;

public class CaseSensitiveExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit letter: ");
        String fruit = sc.nextLine();

        // convert to uppercase (optional but useful)
        fruit = fruit.toUpperCase();

        switch (fruit) {
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Banana");
                break;
            case "C":
                System.out.println("Cherry");
                break;
            case "D":
                System.out.println("Dragon fruit");
                break;
            case "E":
                System.out.println("Elderberry");
                break;
            case "F":
                System.out.println("Fig");
                break;
            case "G":
                System.out.println("Grapes");
                break;
            case "H":
                System.out.println("Honeydew");
                break;
            case "I":
                System.out.println("Indian fig (Prickly pear)");
                break;
            case "J":
                System.out.println("Jackfruit");
                break;
            case "K":
                System.out.println("Kiwi");
                break;
            case "L":
                System.out.println("Lemon");
                break;
            case "M":
                System.out.println("Mango");
                break;
            case "N":
                System.out.println("Nectarine");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "P":
                System.out.println("Pineapple");
                break;
            case "Q":
                System.out.println("Quince");
                break;
            case "R":
                System.out.println("Raspberry");
                break;
            case "S":
                System.out.println("Strawberry");
                break;
            case "T":
                System.out.println("Tangerine");
                break;
            case "U":
                System.out.println("Ugli fruit");
                break;
            case "V":
                System.out.println("Voavanga (Spanish tamarind)");
                break;
            case "W":
                System.out.println("Watermelon");
                break;
            case "X":
                System.out.println("Xigua (Chinese watermelon)");
                break;
            case "Y":
                System.out.println("Yellow passion fruit");
                break;
            case "Z":
                System.out.println("Ziziphus (Jujube)");
                break;
            default:
                System.out.println("It's not an Alphabet");
        }

        sc.close();
    }
}