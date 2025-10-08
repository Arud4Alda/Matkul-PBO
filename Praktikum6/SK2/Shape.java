abstract class Shape 
{
    private String shapeName;

    public Shape(String s)
    {
        shapeName = s;
    }

    public abstract double area();

    public String toString()
    {
        return shapeName;
    }
    
}
