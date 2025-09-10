public class Main {
    public static void main(String[] args) {
        int vasyaAge = 60;
        int katyaAge = 60;
        int mishaAge = 15;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge < katyaAge) {
            min = vasyaAge;
            max = katyaAge;
        } else {
            max = vasyaAge;
            min = katyaAge;
        }

        if (mishaAge <= min) {
            middle = min;
            min = mishaAge;
        } else if (mishaAge >= max) {
            middle = max;
            max = mishaAge;
        } else {
            middle = mishaAge;
        }

        if (min < 0 || max > 120) {
            System.out.println("Incorrect age input");
        } else {
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        }
    }
}
