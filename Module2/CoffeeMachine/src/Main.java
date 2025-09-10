public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilk = 1000;

        boolean isBlocked = true;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappuccinoMilkRequired || milkAmount >= cappuccinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuccinoCoffeeRequired;
        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Coffee machine is blocked");
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Coffee is not enough");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Milk is not enough");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Preparing the coffee");
        }
    }
}

