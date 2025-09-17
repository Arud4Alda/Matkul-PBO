package task;

public class Shape 
{
    // private instance variables
    private String color;
    private boolean filled;

    //Constructors no argument
    public Shape()
    {
        color = "green";
        filled = true;
    }

    //Constructors with argument
    public Shape(String c, boolean f)
    {
        color = c;
        filled = f;
    }

    //getter color
    public String getColor(){
        return color;
    }

    //setter color
    public void setColor(String c)
    {
        this.color=c;
    }

    //getter filled
    public boolean isFilled(){
        return filled;
    }

    //setter color
    public void setFilled(boolean f)
    {
        this.filled=f;
    }

    //method toString
    public String toString() 
    {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}

