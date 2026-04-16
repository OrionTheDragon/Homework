import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int clientOS = (int) (Math.random() * 2);

        StringBuilder str = new StringBuilder();

        // Задание 1
        if (clientOS == 1) {
            str.append("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 0) {
            str.append("Установите версию приложения для Android по ссылке.");
        }
        else {
            str.append("Неизвестное устройство.");
        }

        System.out.println(str);

        System.out.println();

        // Задание 2
        int clientDeviceYear = 2015;
        int randomYear = (int) (Math.random() * (2026 - 2010 + 1)) + 2010;
        System.out.println(randomYear);

        if (randomYear < clientDeviceYear && clientOS == 1) {
            str.setLength(0);
            str.append("Установите облегченную версию приложения для Android по ссылке.");
        }
        else if (randomYear < clientDeviceYear && clientOS == 0) {
            str.setLength(0);
            str.append("Установите облегченную версию приложения для iOS по ссылке.");
        }

        System.out.println(str);

        System.out.println();

        // Задание 3
        int year = 2020;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
            return;
        }

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();

        // Задание 4
        int deliveryDistance = (int) (Math.random() * 121);
        int minDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + minDays);
        }
        else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (minDays += 1));
        }
        else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (minDays += 2));
        }
        else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println();

        // Задание 5
        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Такого месяца не существует");
            return;
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
        }
    }
}