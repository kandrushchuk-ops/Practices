package by.practice;

public class Book {
    int id;
    String name;
    String author;
    String publishing;
    int year;
    int quantity;
    double price;

    public Book(int id, String name, String author, String publishing, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    public Book() {
        System.out.println("Конструктор без параметров");
        this.id = 0;
        this.name = "Неизвестно";
        this.author = "Неизвестен";
        this.publishing = "Неизвестно";
        this.year = 0;
        this.quantity = 0;
        this.price = 0.0;
    }

    public String info() {
        String result = "id: " + id + "\n" +
                "name: " + name + "\n" +
                "author: " + author + "\n" +
                "publishing: " + publishing + "\n" +
                "year: " + year + "\n" +
                "quantity: " + quantity + "\n" +
                "price: " + price;
        return result;
    }

    public void changePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Цена не может быть отрицательной!");
        }
    }
}
