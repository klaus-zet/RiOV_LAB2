public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
}
