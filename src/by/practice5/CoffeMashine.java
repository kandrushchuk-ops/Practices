package by.practice5;

public class CoffeMashine implements Kitchen {
    private String name;
    private String functions;
    private double price;
    private boolean isOn;

    public CoffeMashine(String name, String functions, double price, boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        if (isOn) {
            System.out.println(name + " работает: " + functions);
        } else {
            System.out.println(name + " выключена");
        }
    }

    @Override
    public void cook() {
        if (isOn) {
            System.out.println(name + " варит кофе");
        } else {
            System.out.println(name + " не может варить кофе — выключена");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " выключена");
    }
}
