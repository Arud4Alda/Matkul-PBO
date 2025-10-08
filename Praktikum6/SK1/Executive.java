package Praktikum6.SK1;
//File: Executive.java
//author: Lewis/Loftus
//Represent an Executive staff member who can earn a bonus
public class Executive extends Employee
{
    private double bonus;

    //set up an executive with the specified information
    public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  //bonus has yet to be awarded
    }

    //award the executive a bonus
    public void awardBonus (double execBonus)
    {
        bonus = execBonus;
    }

    //computes and return the pay for an executive, which is the regular employee payment plus a one time bonus
    public double pay()
    {
        double payment = super.pay() + bonus;
        bonus = 0;   //reset bonus
        return payment;
    }
}
