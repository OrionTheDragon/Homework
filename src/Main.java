public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkLeapYear(2021);

        System.out.println();

        System.out.println("Задача 2");
        recommendAppVersion((int) (Math.random() * 2), 2015);

        System.out.println();

        System.out.println("Задача 3");
        int deliveryDistance = (int) (Math.random() * 150) + 1;

        String result = calculateDeliveryDays(deliveryDistance);
        System.out.println(result);
    }

    // -------------------- Задача 1 --------------------
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // -------------------- Задача 2 --------------------
    public static void recommendAppVersion(int osType, int clientDeviceYear) {
        if (osType == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (osType == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // -------------------- Задача 3 --------------------
    public static String calculateDeliveryDays(int distance) {
        if (distance < 0 || distance > 100) {
            return "Доставки нет";
        }

        if (distance <= 20) {
            return "Потребуется дней: 1";
        } else if (distance <= 60) {
            return "Потребуется дней: 2";
        } else {
            return "Потребуется дней: 3";
        }
    }
}