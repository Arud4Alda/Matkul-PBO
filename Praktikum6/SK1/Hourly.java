package Praktikum6.SK1;
//File: Hourly.java
//author: Lewis/Loftus
//Represent an Employee that is paid by the hour
public class Hourly extends Employee
{
    private int hoursWorked;

    //set up an hourly employee using the specified information
    public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    //add the specified number of hours to this employee's accumulated hours
    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }

    //compute and return the pay for this hourly employee
    public double pay()
    {
        double payment = payRate * hoursWorked;

        hoursWorked = 0; //reset hours worked

        return payment;
    }

    //return information about an hourly employee as a string
    public String toString()
    {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
    
}
