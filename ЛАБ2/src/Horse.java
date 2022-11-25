public class Horse extends Animal{
    private int maneLength;

    public Horse(String food, String location, int maneLength) {
        super(food, location);
        this.maneLength = maneLength;
    }

    public int getManeLength(){
        return this.maneLength;
    }

    @Override
    public void makeNoise() {
        System.out.println(
                String.format("The %s with a %d cm mane creates noise",
                        this.getAnimal(),
                        this.getManeLength()
                )
        );
    }
}
