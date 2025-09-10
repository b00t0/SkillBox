import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        while (true) {
            System.out.println("Please input and guess the secret number");
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("You are right!");
                break;
            } else if (attempt < value) {
                System.out.println("The secret number is greater than yours");
            } else {
                System.out.println("The secret number is fewer than yours");
            }
        }
    }
}
