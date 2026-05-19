public class Main {
    public static void main(String[] args) {
        // ================= Задача 1 =================
        System.out.println("Задача 1:");
        StringBuilder firstName = new StringBuilder();
        StringBuilder middleName = new StringBuilder();
        StringBuilder lastName = new StringBuilder();
        StringBuilder fullName = new StringBuilder();

        firstName.append("Ivan");
        middleName.append("Ivanov");
        lastName.append("Ivanovich");
        fullName.append(middleName + " ")
                .append(firstName + " ")
                .append(lastName + ".");

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        // ================= Задача 2 =================
        System.out.println("Задача 2:");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toString().toUpperCase());

        System.out.println();

        // ================= Задача 3 =================
        System.out.println("Задача 3:");
        fullName.setLength(0);
        fullName.append("Иванов Семён Семёнович");
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == 'ё') {
                fullName.setCharAt(i, 'е');
            }
        }

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}