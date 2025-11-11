public class ReverseArray {
    public static int[] reverse(int[] array) {
        // Проверка на null или пустой массив
        if (array == null || array.length <= 1) {
            return array;
        }

        int left = 0;
        int right = array.length - 1;

        // Меняем местами элементы с концов
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }
}
