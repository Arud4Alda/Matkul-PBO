

public class Salesperson  implements Comparable<Salesperson>
{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales)
    {
        lastName = last;
        firstName = first;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + " " + firstName + ": \t" + totalSales;
    }

    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    public int compareTo (Salesperson otherSalesperson)
    {
        int result;
        result = this.totalSales - otherSalesperson.totalSales;

        if (result == 0) 
        {
        // Bandingkan Nama (Alphabetical/Ascending)
            result = this.lastName.compareTo(otherSalesperson.lastName);
            
            if (result == 0) 
            {
                result = this.firstName.compareTo(otherSalesperson.firstName);
            }
        }    

        return result;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

     public int getSales ()
    {
        return totalSales;
    }
}
