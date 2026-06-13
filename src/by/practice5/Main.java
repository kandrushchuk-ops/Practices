package by.practice5;

public class Main {
    public static void main(String[] args) {
        CoffeMashine coffeMashine = new CoffeMashine("Кофейная машина", "Варить кофе", 140, true);
        CoffeMashine coffeMashine1 = new CoffeMashine("Кофейная машина", "Варить кофе", 140, false);

        Fridge fridge = new Fridge("Холодильник", "Samsung", 100, true);

        Washer washer = new Washer("Стиральная машина", "LG", 100, true);

        Cleaner cleaner = new Cleaner("Пылесос", "Dyson", 100, true);


        System.out.println("=== ВЫСТАВКА ЭЛЕКТРОПРИБОРОВ ===");
        ElectroDevice[] electroDevices = {coffeMashine, coffeMashine1, fridge, washer, cleaner};
        for (ElectroDevice device : electroDevices) {
            device.start();
            device.work();
            System.out.println("---");
        }


        System.out.println("КУХОННАЯ ТЕХНИКА ");
        Kitchen[] kitchenDevices = {fridge, coffeMashine};
        for (Kitchen device : kitchenDevices) {
            device.cook();
        }
    }
}
