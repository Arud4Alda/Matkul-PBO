public class Student 
{
    private int idStudent;
    private String name;
    private String department;
    private String address;

    public Student(int is, String n, String d, String a)
    {
        this.idStudent = is;
        this.name = n;
        this.department = d;
        this.address = a;
    }

    public int getID()
    {
        return idStudent;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getAddress()
    {
        return address;
    }
}