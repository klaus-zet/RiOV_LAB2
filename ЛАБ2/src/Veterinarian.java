public class Veterinarian {
    private String name;

    public Veterinarian(String name){
        this.name = name;
    }

    public static void treatAnimal(Animal animal) {
        System.out.println(
                String.format(
                        "Животное - %s; Живет - %s; Питается - %s;",
                        animal.getAnimal(),
                        animal.getLocation(),
                        animal.getFood()
                )
        );
    }
}
