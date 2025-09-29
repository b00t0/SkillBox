public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Desmond", "male");

        cat.setBride("Scottish-straight");
        cat.setSterilised(true);

        System.out.println("Cat: " + cat.getName());
        System.out.println("Bride is: " + cat.getBride());
        System.out.println("Is sterilised: " + cat.isSterilised());

    }
}
