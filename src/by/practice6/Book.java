package by.practice6;

import java.util.Objects;

public class Book {
    String title;
    String author;

    @Override
    public String toString() {
        return "Книга: " +
                "название='" + title + "'" +
                ", автор='" + author + "'";
    }


    public Book(String title, String author){
        this.title = title;
        this.author = author;


    }

    @Override
    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
        return true;
    }


    @Override
    public int hashCode() {
//        return Objects.hash(title, author);
        //return author.hashCode() + title.hashCode();
        return 1;
    }
}

