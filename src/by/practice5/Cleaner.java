package by.practice5;

public class Cleaner implements ElectroDevice {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Cleaner(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    public void clean() {
        work();
    }

    @Override
    public void work() {
        if (isOn) {
            System.out.println(name + " (" + brand + ") убирает пыль");
        } else {
            System.out.println(name + " выключен");
        }
    }
}
