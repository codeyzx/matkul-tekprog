package models;

public class Employee extends Sortable {
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // add getSalary for Interface IManager
    public double getSalary() {
        return salary;
    }

    public int hireYear() {
        return hireyear;
    }

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary)
            return -1;
        if (salary > eb.salary)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[0] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        Sortable.shell_sort(staff);
        int i;
        for (i = 0; i < 3; i++)
            staff[i].print();
    }

    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
}
