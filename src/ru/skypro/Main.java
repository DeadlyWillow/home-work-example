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

        System.out.print(x[0] + ", ");
        System.out.print(x[1] + ", ");
        System.out.print(x[2]);
        System.out.println();
        System.out.print(y[0] + ", ");
        System.out.print(y[1] + ", ");
        System.out.print(y[2]);
        System.out.println();
        System.out.print(z[0] + ", ");
        System.out.print(z[1] + ", ");
        System.out.print(z[2] + ", ");
        System.out.print(z[3] + ", ");
        System.out.print(z[4]);
        System.out.println();

        System.out.println();
        System.out.println("Задание №3");
        System.out.print(x[2] + ", ");
        System.out.print(x[1] + ", ");
        System.out.print(x[0]);
        System.out.println();
        System.out.print(y[2] + ", ");
        System.out.print(y[1] + ", ");
        System.out.print(y[0]);
        System.out.println();
        System.out.print(z[4] + ", ");
        System.out.print(z[3] + ", ");
        System.out.print(z[2] + ", ");
        System.out.print(z[1] + ", ");
        System.out.print(z[0]);
        System.out.println();
        System.out.println();
        System.out.println("Задание №4");
        System.out.println();

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
