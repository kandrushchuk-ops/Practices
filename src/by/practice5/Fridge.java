package by.practice5;

public class Fridge implements Kitchen {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Fridge(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        if (isOn) {
            System.out.println(name + " (" + brand + ") морозит продукты");
        } else {
            System.out.println(name + " выключен");
        }
    }

    @Override
    public void cook() {
        System.out.println(name + " не готовит, а хранит продукты в охлаждённом состоянии");
    }
}
