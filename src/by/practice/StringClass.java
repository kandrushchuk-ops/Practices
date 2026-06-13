package by.practice;

public class StringClass {
    public String stroka(String str) {
        if (str == null) {
            System.out.println("Строка равна null");
            return null;
        }
        System.out.println("Строка: " + str);
        return str;
    }
}

