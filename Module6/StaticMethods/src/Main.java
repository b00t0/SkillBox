public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 120);
        Product bread = new Product("Bread", 100);
        Product butter = new Product("Butter", 200);

        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());

    }
}
