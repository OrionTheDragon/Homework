package org.skypro.skyshop;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public double getAverageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            sum += employee.getSalary();
            count++;
        }
        if (count == 0) return 0;
        return (double) sum / count;
    }

    public void printTaxes(String taxType) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            double tax = 0;
            switch (taxType) {
                case "PROPORTIONAL":
                    tax = employee.getSalary() * 0.13;
                    break;
                case "PROGRESSIVE":
                    int salary = employee.getSalary();
                    if (salary <= 150) {
                        tax = salary * 0.13;
                    } else if (salary <= 350) {
                        tax = salary * 0.17;
                    } else {
                        tax = salary * 0.21;
                    }
                    break;
                default:
                    System.out.println("Неизвестный тип налога: " + taxType);
                    return;
            }
            System.out.println("Налог для " + employee.getName() + " составляет " + tax);
        }
    }

    public void indexSalary(int department, int percent) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getDepartment() != department) {
                continue;
            }
            int newSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
            employee.setSalary(newSalary);
        }
    }

    public void findFirstWithSalaryGreaterThan(int department, int threshold) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > threshold) {
                System.out.print("Порядковый номер в списке: " + i + ". ");
                employee.printShortInfo();
                break;
            }
        }
    }

    public void findEmployeesWithSalaryLessThan(int wage, int employeeNumber) {
        int i = 0;
        int count = 0;
        while (i < employees.length) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < wage) {
                employee.printShortInfo();
                count++;
                if (count == employeeNumber) {
                    break;
                }
            }
            i++;
        }
    }

    public boolean containsAccounting(Employee employee) {
        for (Employee e : employees) {
            if (e != null && e.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
