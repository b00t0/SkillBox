public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(EngineType.DIESEL, 3.5, 156), CarType.SUV, 2300);
        System.out.println("CarType: " + car.getType());
        System.out.println("Weight: " + car.getWeight());
        System.out.println("EngineType: " + car.getEngine().getEngineType());
        System.out.println("Volume: " + car.getEngine().getVolume());
        System.out.println("Power: " + car.getEngine().getPower());
       }
}
