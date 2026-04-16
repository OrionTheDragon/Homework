import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание 1
        int passingAge = 18;
        HashMap<String, Integer> agePeople = new HashMap<>();

        agePeople.put("Вася", 18);
        agePeople.put("Катя", 17);
        agePeople.put("Матвей", 24);
        agePeople.put("Дмитрий", 15);

        for (Map.Entry<String, Integer> aP: agePeople.entrySet()) {
            if (aP.getValue() >= passingAge) {
                System.out.println("Возраст " + aP.getKey() + " равен " + aP.getValue() +
                        " Он/Она совершеннолетний");
            }
            else {
                System.out.println("Возраст " + aP.getKey() + " равен " + aP.getValue() +
                        " Он/Она не достиг совершеннолетия, нужно немного подождать");
            }
        }

        System.out.println();

        // Задание 2
        double airTemp = 5.2;
        double minTemp = 5;

        if (airTemp <= minTemp) {
            System.out.println("На улице " + airTemp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + airTemp + " градусов, можно идти без шапки");
        }

        System.out.println();

        // Задание 3
        int speedCar = (int) (Math.random() * 101);
        int permittedSpeed = 60;

        if (speedCar > permittedSpeed) {
            System.out.println("Если скорость " + speedCar + " то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speedCar + " то можно ездить спокойно");
        }

        System.out.println();

        // Задание 4
        HashMap<String, Integer> agePeople1 = new HashMap<>();

        agePeople1.put("Митя", 4);
        agePeople1.put("Оля", 8);
        agePeople1.put("Валера", 18);
        agePeople1.put("Максим", 30);

        for (Map.Entry<String, Integer> aP: agePeople1.entrySet()) {
            if (aP.getValue() >= 0 && aP.getValue() < 2) {
                System.out.println(aP.getKey() + " равен " + aP.getValue() +
                        " ему не нужно никуда ходить");
            }
            else if (aP.getValue() >= 2 && aP.getValue() <= 6) {
                System.out.println(aP.getKey() + " равен " + aP.getValue() +
                        " ему нужно ходить в детский сад.");
            }
            else if (aP.getValue() >= 7 && aP.getValue() <= 17) {
                System.out.println(aP.getKey() + " равен " + aP.getValue() +
                        " ему нужно ходить в школу.");
            }
            else if (aP.getValue() >= 18 && aP.getValue() <= 24) {
                System.out.println(aP.getKey() + " равен " + aP.getValue() +
                        " его место в университете.");
            }
            else {
                System.out.println(aP.getKey() + " равен " + aP.getValue() +
                        " ему пора ходить на работу.");
            }
        }

        System.out.println();

        // Задание 5
        int age = 12;
        boolean adultPresent = true;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age +
                    ", то ему нельзя кататься на аттракционе.");
        }
        else if (age <= 14) {
            if (adultPresent) {
                System.out.println("Если возраст ребенка равен " + age +
                        ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            }
            else {
                System.out.println("Если возраст ребенка равен " + age +
                        ", то ему нельзя кататься на аттракционе.");
            }
        }
        else {
            System.out.println("Если возраст ребенка равен " + age +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println();

        // Задание 6
        int numberOfPassengers = (int) (Math.random() * 103);
        int carriageCapacity = 102;
        int seating = 60;
        int standingRoom = carriageCapacity - seating;

        if (numberOfPassengers >= seating) {
            if (numberOfPassengers >= carriageCapacity) {
                System.out.println("Все места заняты");
            }
            else {
                int remainingSeats = carriageCapacity - numberOfPassengers;
                System.out.println("Все сидячие места заняты. Свободных стоячих мест " + remainingSeats);
            }
        }
        else {
            int remainingSeats = seating - numberOfPassengers;
            System.out.println("Свободно сидячих мест " + remainingSeats +
                    ", свободно стоячих мест " + standingRoom);
        }

        System.out.println();

        // Задание 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        }
        else if (two >= three) {
            System.out.println("Наибольшее число: " + two);
        }
        else {
            System.out.println("Наибольшее число: " + three);
        }

        System.out.println();

        // Моё решение данной задачи
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(3);

        int first = num.get(0);

        for (int i = 0; i < num.size(); i++) {
            if (first < num.get(i)) {
                first = num.get(i);
            }
        }

        System.out.println("Наибольшее число: " + first);
    }
}