public class TwoDimensionalArray {
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] array = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // если элемент на главной или побочной диагонали
                if (i == j || i + j == size - 1) {
                    array[i][j] = 'X';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        return array;
    }

    // Метод для наглядного вывода (необязательный)
    public static void printArray(char[][] array) {
        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
