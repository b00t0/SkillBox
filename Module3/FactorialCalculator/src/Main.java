import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input the number");
        int value = new Scanner(System.in).nextInt();
        if (value < 1) {
            System.out.println("Incorrect input");
        } else {
            int fact = 1;
            for (int i = 2; i <= value; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " +value + " is " + fact);
        }
    }
}
