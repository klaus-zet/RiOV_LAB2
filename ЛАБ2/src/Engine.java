public class Engine {
    private int power;
    private String type;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.power = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public int getPower() {
        return this.power;
    }
}