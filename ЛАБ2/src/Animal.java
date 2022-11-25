public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location ) {
        this.food = food;
        this.location = location;
    }

    public String getFood(){
        return this.food;
    }

    public String getAnimal() {
        return this.getClass().getSimpleName();
    }

    public void makeNoise() {
        System.out.println(
                String.format("The %s is making noise",
                        this.getAnimal())
        );
    }

    public String getLocation() {
        return this.location;
    }

    public void eat() {
        System.out.println(
                String.format(
                        "The %s eats",
                        this.getAnimal()
                )
        );
    }

    public void sleep() {
        System.out.println(
                String.format(
                        "The %s is sleeping in the %s",
                        this.getAnimal(),
                        this.getLocation()
                )
        );
    }
}
