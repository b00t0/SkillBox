public class Main {
    public static void main(String[] args) {
        int size = 7; // можно изменить размер квадрата

        // Получаем массив из класса TwoDimensionalArray
        char[][] array = TwoDimensionalArray.getTwoDimensionalArray(size);

        // Выводим результат на экран
        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
