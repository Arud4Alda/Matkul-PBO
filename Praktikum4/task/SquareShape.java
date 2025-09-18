package task;

public class SquareShape extends RectangelShape 
{
    //Constructor with argument
    public SquareShape(double side) 
    { 
        super(side, side);   
    } 

    //setter
    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    //getarea
    @Override
    public double getArea()
    {
        return getWidth() * getWidth();
    }

    //get perimeter
    @Override
    public double getPerimeter()
    {
        return 4 * getWidth();
    }
    
    //method tostring
    @Override
    public String toString() 
    {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

}
