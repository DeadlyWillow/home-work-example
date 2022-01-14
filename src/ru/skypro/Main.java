package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int summa = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Задача № 1");
        System.out.println(summa);
        System.out.println();
        System.out.println("Задача № 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println();
        System.out.println("Задача № 3");

        int summ = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            summ = summ + arr[i];
        }
        float average = (float)summ / arr.length;
        System.out.println(average);

        System.out.println();
        System.out.println("Задача № 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
}
