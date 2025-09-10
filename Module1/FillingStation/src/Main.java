import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fuel cost calculation system");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the fuel type (92/95)");
        int fuelType = sc.nextInt();

        System.out.println("Please enter the amount");
        int amount = sc.nextInt();

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Incorrect fuel type");
            amount = 0;
        }

        if (amount < 1) {
            System.out.println("Incorrect fuel amount");
        }

        System.out.println("Fuel price: " + fuelPrice + "RUB");
        System.out.println("Fuel cost: " + Math.round(amount*fuelPrice*100.0)/100.0);
    }
}
