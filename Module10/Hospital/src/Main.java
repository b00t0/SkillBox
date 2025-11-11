public class Main {
    public static void main(String[] args) {
        // Генерируем массив температур через класс Hospital
        float[] temperatures = Hospital.generatePatientsTemperatures(10);

        // Получаем отчёт по этим температурам
        String report = Hospital.getReport(temperatures);

        // Выводим отчёт на экран
        System.out.println(report);
    }
}
