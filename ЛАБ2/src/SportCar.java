public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String mark, String carClass, Engine engine, int weight, int maxSpeed) {
        super(mark, carClass, engine, weight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void start() {
        System.out.println("SportCar поехал");
    }

    public void stop() {
        System.out.println("SportCar остановился");
    }
}