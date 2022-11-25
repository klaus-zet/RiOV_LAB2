import java.util.Arrays;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String model, int weight, String number) {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public int getWeight() {
        return this.weight;
    }

    public Phone(String number, int weight) {
        this.model = "Xiomi MI12 PRO";
        this.weight = weight;
        this.number = number;
    }

    public Phone() {
        this.weight = 340;
        this.model = "IPhone 14 PRO MAX";
        this.number = "+7(925)123-45-67";
    }

    public void receiveCall(String callerName) {
        System.out.println(String.format("Звонит: %s", callerName));
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(String.format("Звонит: %s. Номер: %s", callerName, callerNumber));
    }

    public void sendMessage(String... numbers) {
        System.out.println("Кому отправить сообщение: " + String.join(", ", numbers));
    }

}