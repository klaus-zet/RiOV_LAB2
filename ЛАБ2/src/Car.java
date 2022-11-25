public abstract class Car {
    private String mark;
    private String carClass;
    private Engine engine;
    private int weight;

    public Car(String brand, String carClass, Engine engine, int weight) {
        this.mark = brand;
        this.carClass = carClass;
        this.engine = engine;
        this.weight = weight;
    }

    public abstract void start();

    public abstract void stop();

    public String getMark() {
        return this.mark;
    }

    public String getCarClass() {
        return this.carClass;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public int getWeight() {
        return this.weight;
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void getInfo() {
        System.out.println(
                String.format(
                        "%s %s класса, оснащенная двигателем %s и мощностью %s, движется в направлении финаша",
                        this.getMark(),
                        this.getCarClass(),
                        this.getEngine().getType(),
                        this.getEngine().getPower()
                )
        );
    }
}