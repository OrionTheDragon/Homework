public class Main {
    public static void main(String[] args) {
        // ================= Задача 1 =================
        System.out.println("Задача 1:");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName;

        fullName = middleName + " " + firstName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        // ================= Задача 2 =================
        System.out.println("Задача 2:");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();

        // ================= Задача 3 =================
        System.out.println("Задача 3:");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}