import java.util.GregorianCalendar;
import java.util.Calendar;
public class Manager extends Employee implements Sortable{
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
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

    @Override
    public int compare(Sortable b) {
        Manager mb = (Manager) b;
        if (super.getSalary() < mb.getSalary()) {
            return -1;
        }
        if (super.getSalary() > mb.getSalary()) {
            return +1;
        }
        return 0;
    }
}
