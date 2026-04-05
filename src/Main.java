//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5f;
        double d = 6.6;

        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println();

        System.out.println("----- Задача 2 -----");
        float fl = 27.12f;
        long ln = 987678965549L;
        float fl1 = 2.786f;
        int in = 569;
        int in1 = -159;
        int in2 = 27897;
        float fl2 = 67;

        System.out.println();

        System.out.println("----- Задача 3 -----");
        // Людмилы Павловны
        byte lp = 23;
        // Анны Сергеевны
        byte as = 27;
        // Екатерины Андреевны
        byte ea = 30;
        // Листы
        int sheet = 480;

        byte all = (byte) (lp + as + ea);

        int newSheet = sheet / all;

        System.out.println("На каждого ученика рассчитано " + newSheet + " листов бумаги.");

        System.out.println();

        System.out.println("----- Задача 4 -----");
        // Сначала выясняем производительность за 1 минуту, после уже делаем расчёты исходя из этого.
        // за 2 минуты
        byte bottle = 16;
        // за 1 минуту
        bottle /= 2;
        System.out.println("За 1 минуту: " + bottle + " бутылок");

        // за 20 минут
        int twentyMinutesBottle = bottle * 20;
        System.out.println("За 20 минуту: " + twentyMinutesBottle + " бутылок");

        // за сутки
        int dayBottle = bottle * 1440;
        System.out.println("За сутки: " + dayBottle + " бутылок");

        // за месяц
        int monthBottle = bottle * 43800;
        System.out.println("За месяц: " + monthBottle + " бутылок");

        System.out.println();

        System.out.println("----- Задача 5 -----");
        // сколько краски уходит на класс
        byte brownPaintWasted = 4;
        byte whitePaintWasted = 2;

        // Узнаем количество классов
        byte dyeAll = (byte) (120 / (brownPaintWasted + whitePaintWasted));

        // Узнаем конкретно сколько красок было куплено
        byte brownPaint = (byte) (dyeAll * brownPaintWasted);
        byte whitePaint = (byte) (dyeAll * whitePaintWasted);

        System.out.println("В школе, где " + dyeAll + " классов, нужно " + whitePaint + " банок белой краски и " +
                brownPaint + " банок коричневой краски");

        System.out.println();

        System.out.println("----- Задача 6 -----");
        // Сразу вычисляем общую граммовку продуктов.
        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int rawEggs = 70 * 4;

        int allWeight = banana + milk + iceCream + rawEggs;

        System.out.println("Общий вес в граммах: " + allWeight);

        float allWeightF = (float) allWeight / 1000;
        System.out.println("Общий вес в КГ: " + allWeightF);

        System.out.println();

        System.out.println("----- Задача 7 -----");
        // Приводим 7КГ в граммы
        int grams = 7 * 1000;

        // По 250 грамм
        int twoHundredFifty = grams / 250;
        System.out.println("Уйдёт дней если худеть на 250 грамм: " + twoHundredFifty);

        // По 500 грамм
        int fiveHundred = grams / 500;
        System.out.println("Уйдёт дней если худеть на 500 грамм: " + fiveHundred);

        // В среднем
        int onAverage = (fiveHundred + twoHundredFifty) / 2;
        System.out.println("Уйдёт дней в среднем: " + onAverage);

        System.out.println();

        System.out.println("----- Задача 8 -----");
        // ЗП сотрудников месяц старая
        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryChristina = 76230;

        // ЗП сотрудников за год старая
        int oldYearSalaryMasha = oldSalaryMasha * 12;
        int oldYearSalaryDenis = oldSalaryDenis * 12;
        int oldYearSalaryChristina = oldSalaryChristina * 12;

        double percent = 10;

        // ЗП сотрудников месяц новая
        int newSalaryMasha = (int) (oldSalaryMasha * (1 + percent / 100));
        int newSalaryDenis = (int) (oldSalaryDenis * (1 + percent / 100));
        int newSalaryChristina = (int) (oldSalaryChristina * (1 + percent / 100));

        // ЗП сотрудников за год новая
        int newYearSalaryMasha = newSalaryMasha * 12;
        int newYearSalaryDenis = newSalaryDenis * 12;
        int newYearSalaryChristina = newSalaryChristina * 12;

        // Рост годового дохода
        int annualIncomeGrowthMasha = newYearSalaryMasha - oldYearSalaryMasha;
        int annualIncomeGrowthDenis = newYearSalaryDenis - oldYearSalaryDenis;
        int annualIncomeGrowthChristina = newYearSalaryChristina - oldYearSalaryChristina;

        System.out.println("Маша теперь получает в месяц " + newSalaryMasha + " рублей." +
                "В год получает " + newYearSalaryMasha + ", Годовой доход вырос на " + annualIncomeGrowthMasha + " рублей");
        System.out.println("Денис теперь получает в месяц " + newSalaryDenis + " рублей." +
                "В год получает " + newYearSalaryDenis + ", Годовой доход вырос на " + annualIncomeGrowthDenis + " рублей");
        System.out.println("Кристина теперь получает в месяц " + newSalaryChristina + " рублей." +
                "В год получает " + newYearSalaryChristina + ", Годовой доход вырос на " + annualIncomeGrowthChristina + " рублей");
    }
}