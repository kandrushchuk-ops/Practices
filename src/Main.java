import by.practice.Book;

class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(1, "Java", "Schildt", "Pearson", 1000, 100, 2018);

        // Выводим информацию о книгах
        String infoForBook1 = book1.info();
        String infoForBook2 = book2.info();
        System.out.println(infoForBook1);
        System.out.println(infoForBook2);

        // Изменяем цену и выводим обновлённую информацию
        book2.changePrice(100);
        String updatedInfoForBook2 = book2.info();
        System.out.println("После изменения цены:");
        System.out.println(updatedInfoForBook2);

        // Создаём массив книг и заполняем его
        Book[] arrayBook = createArrayBook();

        // Выводим информацию обо всех книгах в массиве
        System.out.println("\nИнформация о книгах в массиве:");
        for (Book book : arrayBook) {
            if (book != null) {
                System.out.println(book.info());
            }
        }
    }

    public static Book[] createArrayBook() {
        Book[] arrayBook = new Book[5];

        arrayBook[0] = new Book(2, "Effective Java", "Bloch", "Addison-Wesley", 400, 150, 2018);
        arrayBook[1] = new Book(3, "Clean Code", "Martin", "Prentice Hall", 450, 130, 2008);
        arrayBook[2] = new Book(4, "Design Patterns", "Gamma et al.", "Addison-Wesley", 350, 120, 1994);
        arrayBook[3] = new Book(5, "Algorithms", "Sedgewick", "Addison-Wesley", 800, 200, 2011);
        arrayBook[4] = new Book(6, "Head First Java", "Bates", "O'Reilly", 600, 140, 2005);

        return arrayBook;
    }
}
