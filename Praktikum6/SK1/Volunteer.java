package Praktikum6.SK1;
//File: Volunteer.java
//author: Lewis/Loftus
//Represent a staff member that works as a volunteer

public class Volunteer extends StaffMember
{
    //set up a volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    //return zero pay value for this volunteer
    public double pay()
    {
        {
            return 0.0;
        }
    }
}
