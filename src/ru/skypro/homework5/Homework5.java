package ru.skypro.homework5;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int g = 10; g >= 1; g--) {
            System.out.print(g + " ");
        }

        System.out.println("");
        System.out.println("Задание 2");
        int firstFriday = 1;
        for (i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("");
        System.out.println("Задание 3");
        int currentYear = 2021;
        for (int h = currentYear - 200; h < currentYear + 100; h++) {
            if (h % 79 == 0) {
                System.out.println(h);
            }
        }
    }
}