import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the number");
        int value = new Scanner(System.in).nextInt();
        if (value < 1) {
            System.out.println("Incorrect input");
        } else {
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    for (int j = value; j > 0 ; j--) {
                        if (i * j == value) {
                            System.out.println(i + "*" + j);
                        }
                    }
                }
            }
        }
    }
}
