package Praktikum6.SK1;
//File: StaffMember.java
//author: Lewis/Loftus
//Represent a generic staff member
abstract class StaffMember 
{
    protected String name;
    protected String address;
    protected String phone;
    
    //sets up a staff member using the specified information

    public StaffMember (String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //returns a string including the basic employee information
    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }

    //deverived classes must define the pay method for each type of employee
    public abstract double pay();
}
