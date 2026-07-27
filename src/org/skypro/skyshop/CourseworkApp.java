package org.skypro.skyshop;

public class CourseworkApp {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        System.out.println("--- Добавление 11 сотрудников ---");
        System.out.println("Добавлен 1: " + book.addEmployee(new Employee("Иванов Иван", 1, 100)));
        System.out.println("Добавлен 2: " + book.addEmployee(new Employee("Петров Петр", 2, 120)));
        System.out.println("Добавлен 3: " + book.addEmployee(new Employee("Сидоров Сидор", 3, 160)));
        System.out.println("Добавлен 4: " + book.addEmployee(new Employee("Алексеев Алексей", 4, 300)));
        System.out.println("Добавлен 5: " + book.addEmployee(new Employee("Смирнов Алексей", 5, 400)));
        System.out.println("Добавлен 6: " + book.addEmployee(new Employee("Козлов Иван", 1, 140)));
        System.out.println("Добавлен 7: " + book.addEmployee(new Employee("Николаев Николай", 2, 80)));
        System.out.println("Добавлен 8: " + book.addEmployee(new Employee("Федоров Федор", 3, 200)));
        System.out.println("Добавлен 9: " + book.addEmployee(new Employee("Морозов Михаил", 4, 340)));
        System.out.println("Добавлен 10: " + book.addEmployee(new Employee("Волков Владимир", 5, 450)));
        
        // Попытка добавить 11-го сотрудника (должно вернуть false)
        System.out.println("Добавлен 11: " + book.addEmployee(new Employee("Лебедев Лев", 1, 50)));

        System.out.println("\n--- Список всех сотрудников ---");
        book.printAllEmployees();

        System.out.println("\n--- Средняя зарплата ---");
        System.out.println("Средняя зарплата: " + book.getAverageSalary());

        System.out.println("\n--- Налоги (ПРОПОРЦИОНАЛЬНАЯ шкала) ---");
        book.printTaxes("PROPORTIONAL");

        System.out.println("\n--- Налоги (ПРОГРЕССИВНАЯ шкала) ---");
        book.printTaxes("PROGRESSIVE");

        System.out.println("\n--- Индексация зарплаты на 10% в отделе 1 ---");
        book.indexSalary(1, 10);
        book.printAllEmployees();

        System.out.println("\n--- Первый сотрудник в отделе 2 с зарплатой больше 100 ---");
        book.findFirstWithSalaryGreaterThan(2, 100);

        System.out.println("\n--- Первые 3 сотрудника с зарплатой меньше 200 ---");
        book.findEmployeesWithSalaryLessThan(200, 3);

        System.out.println("\n--- Проверка наличия сотрудника (бух. учет по зарплате) ---");
        Employee dummy = new Employee("Тест", 1, 400);
        System.out.println("Есть ли сотрудник с зарплатой 400? " + book.containsAccounting(dummy));

        System.out.println("\n--- Получение сотрудника по id (id = 3) ---");
        Employee found = book.getEmployeeById(3);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Сотрудник не найден");
        }
    }
}
