import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        boolean flag = true;
        while (flag == true) {
            System.out.println("Выберете номер задания: ");
            Scanner scan = new Scanner(System.in);
            int task = scan.nextInt();


            switch (task) {
                case (1): {
                    Student[] students = {
                            new Student("Иван", "Маркин", "МФТИ1701", 5),
                            new Student("Дени", "Иризбаев", "БУТ1901", 3.0),
                            new Aspirant("Тимофей", "Терентьев", "МИРЭА1701", 5, "Исследование роботизированных систем"),
                            new Student("Николай", "Кондратьев", "БУТ1901", 4.1),
                            new Aspirant("Даниил", "Каштанов", "БУТ1901", 4.7, "Безопасность сетей"),
                            new Aspirant("АРТУР", "ПИРОГОВ", "БУТ1901", 5, "Исследование нейросетей"),
                    };

                    for (Student student : students) {
                        System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getScholarship());
                    }
                }
                flag = false;
                break;

                case (2): {
                    Animal[] animals = {
                            new Cat("Молоко", "Ковер", "мягкие"),
                            new Dog("Корм", "Будка", "Волкодав"),
                            new Horse("Сено", "Конюшня", 25),
                    };

                    for (Animal animal : animals) {
                        if (animal.getAnimal() == "Horse") {
                            animal.makeNoise();
                        }
                        Veterinarian.treatAnimal(animal);
                    }
                }
                flag = false;
                break;

                case (3): {
                    Phone[] phones = {
                            new Phone("+7(977)106-15-46", 333),
                            new Phone("+7(903)654-75-18", 321),
                            new Phone(),
                    };

                    for (Phone phone : phones) {
                        System.out.println(String.format("%s %s %s", phone.getWeight(), phone.getModel(), phone.getNumber()));
                    }
                    Phone phone = phones[0];
                    phone.sendMessage("+7(903)654-75-18", "+7(977)106-15-46", "+7(925)564-76-15");
                    phone.receiveCall("Иван Маркин");
                    phone.receiveCall("Тимофей Терентьев", "+7(977)106-15-46");
                }
                    flag = false;
                    break;

                case (4): {
                    Car[] cars = {
                            new Car("Mazda", "B", new Engine("A308", 130), 1320) {
                                @Override
                                public void start() { }
                                @Override
                                public void stop() { }
                            },
                            new SportCar("Mazda", "Coupe", new Engine("2JZet", 1060), 1150, 310)
                                };
                    for (Car car : cars){
                        car.turnLeft();
                        car.turnRight();
                        car.getInfo();
                    }

                            }
                    flag = false;
                    break;




            }
        }
    }
}
