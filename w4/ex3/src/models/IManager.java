package models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class IManager extends Employee implements ISortable {
    public IManager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    private String secretaryName;

    public int compare(Sortable b) {
        IManager obj = (IManager) b;
        if (this.getSalary() > obj.getSalary())
            return 1;
        else if (this.getSalary() < obj.getSalary())
            return -1;
        else
            return 0;
    }
}
