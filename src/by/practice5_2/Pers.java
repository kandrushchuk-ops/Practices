package by.practice5_2;

public class Pers {
    private String name;
    private String lastName;

    public Pers(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
