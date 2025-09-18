package task;

public class RectangelShape extends Shape 
{
     // private instance variables
    private double width;   
    private double length;

    //Constructor no argument
    public RectangelShape()
    {
        super();
        width = 1.0;
        length = 1.0;
    }

    //Constructor with argument
    public RectangelShape(double w, double l)
    {
        super();
        width = w;
        length = l;
    }

    //Constructor with argument
    public RectangelShape(double w, double l, String c, boolean f)
    {
        super(c, f);
        width = w;
        length = l;
    }

    //getter width
    public double getWidth()
    {
        return width;
    }

    //setter width
    public void setWidth(double w)
    {
        this.width = w;
    }

    //getter length
    public double getLength()   
    {
        return length;
    }

    //setter length
    public void setLength(double l)
    {
        this.length = l;
    }

    //method getArea
    public double getArea()
    {
        return width * length;
    }   

    //method getPerimeter
    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    //method tostring
    @Override
    public String toString() 
    {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }    
}
