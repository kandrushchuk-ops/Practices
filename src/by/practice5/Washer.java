package by.practice5;

public class Washer implements ElectroDevice {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Washer(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        if (isOn) {
            System.out.println(name + " (" + brand + ") стирает бельё");
        } else {
            System.out.println(name + " выключена");
        }
    }
}
