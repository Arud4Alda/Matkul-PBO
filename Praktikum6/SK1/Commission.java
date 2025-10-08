package Praktikum6.SK1;

public class Commission extends Hourly
{
    protected double total_sale;
    protected double commission_rate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comm_rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        total_sale = 0.0;
        commission_rate = comm_rate;
    }

    public void addSales(double total_sale)
    {
        this.total_sale += total_sale;
    }

    public double pay()
    {
        double payment = super.pay() + total_sale * commission_rate;
        total_sale = 0;
        return payment;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sale: " + total_sale;
        return result;
    }
}
