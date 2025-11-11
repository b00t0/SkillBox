import java.util.Random;

public class Hospital {

    // Метод генерирует массив температур пациентов от 32.0 до 40.0
    public static float[] generatePatientsTemperatures(int patientsCount) {
        Random random = new Random();
        float[] temperatures = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            // температура в диапазоне [32.0, 40.0)
            temperatures[i] = 32.0f + random.nextFloat() * 8.0f;
        }

        return temperatures;
    }

    // Метод формирует отчет по пациентам
    public static String getReport(float[] temperatureData) {
        StringBuilder temperaturesList = new StringBuilder();
        float sum = 0;
        int healthyCount = 0;

        for (float temp : temperatureData) {
            sum += temp;

            // если температура в пределах нормы
            if (temp >= 36.2f && temp <= 36.9f) {
                healthyCount++;
            }

            // добавляем температуру в строку (с округлением до 1 знака)
            temperaturesList.append(String.format("%.1f ", temp));
        }

        // вычисляем среднюю температуру
        float averageTemp = sum / temperatureData.length;

        // формируем итоговый отчёт
        return String.format(
                "Температуры пациентов: %s\nСредняя температура: %.2f\nКоличество здоровых: %d",
                temperaturesList.toString().trim(),
                averageTemp,
                healthyCount
        );
    }
}
