package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void getYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void main(String[] args) {
        getYear(2020);
        recommendAplcetionVersion(2023, 1);
        printDeliveryDays(30);
        findDuplicates("qrty");
        int[] testArray = new int[]{3, 2, 1, 6, 5};
        reverseArray(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void recommendAplcetionVersion(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void printDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        System.out.println("Потребуется дней: " + days);
    }

    public static void findDuplicates(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                System.out.println("found duplicate :" + charArray[i]);
                return;
            }
        }
        System.out.println("duplicates not found");
    }

    public static void reverseArray(int[] array) {
       for(int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
           array[i] = array[array.length - 1 - i];
           array[array.length - 1 - i] = temp;
       }
    }
}
