package test;

import models.Employee;
import models.IManager;

public class EmployeeTest {
    public static void main(String[] args) {
        // Default
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++)
            staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++)
            staff[i].print();

        // Case 1

        System.out.println("======= Case 1 =======");
        Employee.main(args);

        // Case 2
        // Imagine that we want to order the Managers in a similar way :
        // class Managers extends Employee extends Sortable
        // It will be work?
        // What is your solution
        // ** Answer : Itu tidak akan bekerja karena Inheritance tidak bisa dilakukan
        // dalam multiple level atau lebih dari 1 level
        // ** Solusi : Membuat interface baru yang meng-extends Sortable dan
        // di-implementasikan oleh Manager
        System.out.println("======= Case 2 =======");
        IManager[] managers = new IManager[3];
        managers[2] = new IManager("Antonio Rossi", 2000000, 1, 10, 1989);
        managers[1] = new IManager("Maria Bianchi", 2500000, 1, 12, 1991);
        managers[0] = new IManager("Isabel Vidal", 3000000, 1, 11, 1993);
        IManager.shell_sort(managers);
        int j;
        for (j = 0; j < 3; j++)
            managers[j].raiseSalary(5);
        for (j = 0; j < 3; j++)
            managers[j].print();
    }
}
