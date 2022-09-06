package TrafficLight;

public class TrafficLightTest {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight trafficLight = new TrafficLight();

        Car car1 = new Car(1, trafficLight);
        Car car2 = new Car(2, trafficLight);
        Car car3 = new Car(3, trafficLight);
        Pedestrian pedestrian = new Pedestrian("Gabi", trafficLight);
        SleepyDriver sleepyDriver = new SleepyDriver(4, trafficLight);
        Taxi taxi = new Taxi(5, trafficLight);

        trafficLight.start();

    }
}
