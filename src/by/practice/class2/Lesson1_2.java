package by.practice.class2;

import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        int minN = 100;
        int maxN = 0;
        int vr;
        if (x % 10 == 0) {
            System.out.println("Число x не соответствует условию задания");
        } else {
            while (x > 0) {
                vr = x % 10;
                if (minN > vr) {
                    minN = vr;
                }
                if (maxN < vr) {
                    maxN = vr;
                }
                x = x / 10;
            }
            System.out.println("Минимальное число: " + minN + " " + "Максимальное число: " + maxN);
        }


    }

}

//8. Ввести число с консоли,
//которое не заканчивается на 0. Вывести макс и мин цифру
//в числе. Использовать оператор %. (while)