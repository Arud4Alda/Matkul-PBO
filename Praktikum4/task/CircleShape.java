package task;

public class CircleShape extends Shape 
{
    private double radius;

    //Constructor no argument
    public CircleShape()
    {
        super();
        radius = 1.0;
    }

    //Constructor with argument
    public CircleShape(double r)
    {
        super();
        radius = r;
    }

    //Constructor with argument
    public CircleShape(double r, String c, boolean f)
    {
        super(c, f);
        radius = r;
    }

    //getter radius
    public double getRadius()
    {
        return radius;
    }

    //setter radius
    public void setRadius(double r)
    {
        this.radius = r;
    }

    //method getArea
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    //method tostring
    @Override
    public String toString() 
    {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }    
}
