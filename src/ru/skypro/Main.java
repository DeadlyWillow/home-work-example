package ru.skypro;

public class Main {

    public static void main(String[] args) {

    int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        float[] y = {1.57f, 7.654f, 9.986f};
        int[] z = {4, 2, 6, 7, 1};

        System.out.println("Задание №2");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание №3");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + ", ");
        }
        System.out.println();
        for (int i = y.length - 1; i >= 0; i--) {
            System.out.print(y[i] + ", ");
        }
        System.out.println();
        for (int i = z.length - 1; i >= 0; i--) {
            System.out.print(z[i] + ", ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Задание №4");
        for (int i = 0; i < x.length; i++){
            if (x[i] % 2 == 0) {
                System.out.print(x[i] + " ");
            }
            else {
                x[i]++;
                System.out.print(x[i] + " ");
            }
        }
    }
}
