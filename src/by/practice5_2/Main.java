package by.practice5_2;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Анна", "Сидорова", "Информатика");
        Employee employee1 = new Employee("Иван", "Петров", 50000);
        Employee employee2 = new Employee("Мария", "Иванова", 60000);


        Table<Integer, Student> table1 = new Table<>(101, student);
        Table<Integer, Employee> table2 = new Table<>(102, employee1);
        Table<Integer, Employee> table3 = new Table<>(103, employee2);


        System.out.println("=== ИМЕНА ПЕРСОНАЖЕЙ ЗА СТОЛАМИ ===");
        table1.printCharacterName();
        table2.printCharacterName();
        table3.printCharacterName();


        System.out.println("\n=== ПОЛНАЯ ИНФОРМАЦИЯ О СТОЛАХ ===");
        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table3);
    }
}
