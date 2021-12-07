package ru.skypro;

public class Main {

    public static void main(String[] args) {

        byte a = 124;
        int b = 1032456;
        short c = 26123;
        long d = 2345756478L;
        float e = 43.24f;
        double f = 2455.41446344;

        System.out.println("Задание №1");
        System.out.println("");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
            System.out.println("общий вес двух бойцов равен " + totalWeight);
            System.out.println("");

        System.out.println("Задание №2");
        System.out.println("");

        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;

       int breakfastWeight = bananas * 5 + milk * 2 + iceCream * 2 + eggs * 4;
            System.out.println("Вес завтрака спортсмена составляет " + breakfastWeight);
            System.out.println("");

        System.out.println("Задание №3");
        System.out.println("");
       int weightNeedsToBeLost = 7000;
       int loseWeight1 = 250;
       int loseWeight2 = 500;
       int losingWeightBy250GramsEveryDay = weightNeedsToBeLost / loseWeight1;
       int losingWeightBy500GramsEveryDay = weightNeedsToBeLost / loseWeight2;
            System.out.println(losingWeightBy250GramsEveryDay + " дней уйдёт на похудение, " +
                    "если спортсмен будет терять каждый день по 250 грамм");
            System.out.println(losingWeightBy500GramsEveryDay + " дней уйдёт на похудение, " +
                    "если спортсмен будет терять каждый день по 500 грамм");
       int averageDaysLosingWeight = (losingWeightBy250GramsEveryDay + losingWeightBy500GramsEveryDay) / 2;
            System.out.println(averageDaysLosingWeight + " требовуется дней в среднем, " +
                    "чтобы добиться результата похудения." );
            System.out.println("");

        System.out.println("Задание №4");
        System.out.println("");
            int salaryMasha = 67760;
            int salaryDenis = 83690;
            int salaryKristina = 76230;
            float newSalaryCoefficient = 1.1f;
            float newSalaryMasha = salaryMasha * newSalaryCoefficient;
            float newSalaryDenis = salaryDenis * newSalaryCoefficient;
            float newSalaryKristina = salaryKristina * newSalaryCoefficient;
            float annualIncomeDifferenceMasha = (newSalaryMasha - salaryMasha) * 12;
            float annualIncomeDifferenceDenis = (newSalaryDenis - salaryDenis) * 12;
            float annualIncomeDifferenceKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " +
                "Годовой доход вырос на " + annualIncomeDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + annualIncomeDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + annualIncomeDifferenceKristina + " рублей");

    }
}
