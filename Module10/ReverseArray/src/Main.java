public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Вызываем метод из другого класса
        ReverseArray.reverse(numbers);

        // Проверим результат
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
