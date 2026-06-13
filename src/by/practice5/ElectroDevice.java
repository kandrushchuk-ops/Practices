package by.practice5;

public interface ElectroDevice {
    void work();
    default void start() {
        System.out.println("Электроприбор стартует");
    }
}
