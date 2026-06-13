package by.practice5_2;

public class Employee extends Pers {
    private int salary;

    public Employee(String name, String lastName, int salary) {
        super(name, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " (Сотрудник, зарплата: " + salary + ")";
    }
}
