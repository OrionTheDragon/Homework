public class Main {
    public static void main(String[] args) {
        // Задача 1
        int firstFriday = 1;

        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                firstFriday += 7;
            }
        }

        System.out.println();

        // Задача 2
        int fiveHundred = 500;
        int distanceCovered = 0;
        int finalDistance = 42195;
        int count = 0;
        do {
            distanceCovered += fiveHundred;
            int left = finalDistance - distanceCovered;
            if (left <= 0) {
                System.out.println("Марафон пройден!");
                break;
            }
            count++;
            System.out.println(count + ") Держитесь! Осталось " + left);
        }
        while (distanceCovered < finalDistance);

        System.out.println("--------------");

        count = 0;
        for (int i = fiveHundred; i <= finalDistance; i += fiveHundred) {
            System.out.println("Держитесь! Осталось " + (finalDistance - i) + " метров.");
        }

        System.out.println();

        // Задача 3
        int money = 5000;
        int currentDay = 1;
        int step = 100;

        while (money > 0) {
            if (currentDay % 5 == 0) {
                System.out.println("Сегодня " + currentDay + " день, парковка бесплатная!");
                currentDay++;
                continue;
            }
            // Можно использовать else, но раз в условии написано использовать continue, то я его и использую
            money -= step;
            int daysLeft = money / step;
            System.out.println("Сегодня " + currentDay + " день, парковка стоит "
                    + step + " рублей. На вашем счету осталось " + money + " рублей");
            System.out.println("Итого парковки хватит на " + daysLeft + " дней.");
            currentDay++;
        }

        System.out.println("--------------");

        money = 5000;
        for (int i = 1; money > 0; i++) {
            if (i % 5 == 0) {
                System.out.println("Сегодня " + i + " день, парковка бесплатная!");
                continue;
            }
            // Можно использовать else, но раз в условии написано использовать continue, то я его и использую
            money -= step;
            int daysLeft = money / step;
            System.out.println("Сегодня " + i + " день, парковка стоит "
                    + step + " рублей. На вашем счету осталось " + money + " рублей");
            System.out.println("Итого парковки хватит на " + daysLeft + " дней.");
        }

        System.out.println();

        // Задача 4
        int finalMoney = 12_000_000;
        int month = 0;
        double total = 0;
        step = 15000;

        while (true) {
            month++;
            total += step;
            if (month % 6 == 0) {
                total += (total * 0.07);
                System.out.println("+ 7% полугодовых");
            }

            System.out.printf("Месяц: " + month + ") Сумма накоплений = %.2f\n", total);

            if (total >= finalMoney) {
                System.out.println("Вы накопили 12 миллионов!");
                break;
            }
        }

        System.out.println();

        // Задача 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge <= 100) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Минута " + minute + ": Перегрев! Пауза на 2 минуты.");

                if (overheats > 3) {
                    System.out.println("Критическое количество перегревов!");
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }

                minute += 2;
                continue;
            }

            charge += 2;
            if (charge > 100) {
                charge = 100;
            }

            System.out.println("Мин. " + minute + ": Зарядка... " + charge + "%");
        }

        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}