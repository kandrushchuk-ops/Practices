package by.practice5_2;

public class Student extends Pers {
    private String faculty;

    public Student(String name, String lastName, String faculty) {
        super(name, lastName);
        this.faculty = faculty; // Исправлено: this.faculty → this.faculty
    }


    public String getFaculty() {
        return faculty;
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty; // Исправлено: this.faculty → this.faculty
    }

    @Override
    public String toString() {
        return super.toString() + " (Студент, факультет: " + faculty + ")";
    }
}
