public class Cat extends Animal {
    private String paws;

    public Cat(String food, String location, String paws) {
        super(food, location);
    }

    public String getPaws() {
        return this.paws;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
}
