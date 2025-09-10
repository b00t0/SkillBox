public class Main {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int currentVolume = 0;
        int count = 0;

        while (currentVolume < volume) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            count++;
        }
        System.out.println("The filling time is " + count + " minutes");
    }
}
