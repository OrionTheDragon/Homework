public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        System.out.println();

        // Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Задача 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Задача 5
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println();

        // Задача 6
        for (int i = 7; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        // Задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println();

        // Задача 8
        int step = 29000;
        double allMoney = 0;
        for (int i = 0; i < 12; i++) {
            allMoney += step;
            System.out.println("Месяц " + (i + 1) + " сумма накоплений равна " + allMoney + " рублей");
        }

        System.out.println();

        // Задача 9
        allMoney = 0;
        for (int i = 0; i < 12; i++) {
            allMoney += (allMoney * 0.01);
            allMoney += step;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " +
                    String.format("%.2f", allMoney) + " рублей");
        }

        System.out.println();

        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}