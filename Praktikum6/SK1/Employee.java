package Praktikum6.SK1;
//File: Employee.java
//author: Lewis/Loftus
//Represent a generic staff member
public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //return information about an employee as a string
    public String toString()
    {
        String result = super.toString();
        result+= "\nSocial Security Number: "+ socialSecurityNumber;
        return result;
    }

    //return the pay rate for an employee
    public double pay()
    {
        return payRate;
    }
}
