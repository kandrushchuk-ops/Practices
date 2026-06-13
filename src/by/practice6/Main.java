package by.practice6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        List<String> myList = new ArrayList<>();
//
//        myList.add("Привет");
//        myList.add("Как дела?");
//        myList.add("Праздник");
//        myList.add("Суфле");
//
//        System.out.println(myList);
//
//        boolean confeta = myList.contains("Конфета");
//        System.out.println(confeta);
//
//        int size = myList.size();
//        System.out.println("Количество элементов: " + size);
//
//        ArrayList<String> shoppingList = new ArrayList<>();
//        shoppingList.add("Хлеб");
//        shoppingList.add("Молоко");
//        shoppingList.add("Яйца");
//        shoppingList.add("Бананы");
//        shoppingList.add("Сыр");
//
//        System.out.println(shoppingList);
//
//        shoppingList.remove("Бананы");
//        System.out.println(shoppingList);

        List<Book> bookList = new ArrayList<>();
                Book book = new Book("Мастер и Маргарита", "Булгаков");
        Book book2 = new Book("Толстой", "Гоголь");
        Book book3 = new Book("Достоевский", "Книга");
        Book book4 = new Book("Достоевский", "Книга");
        bookList.add(book);
        bookList.add(book2);
        bookList.add(book3);

        System.out.println(bookList);

        bookList.remove(book2);
        System.out.println(bookList);

        Set<Book> bookSet = new HashSet<>();
        System.out.println(bookSet);

        bookSet.add(book);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        System.out.println(bookSet);


    }
}

