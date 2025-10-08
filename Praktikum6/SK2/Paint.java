public class Paint 
{
    private double coverage;

    //construktor
    public Paint(double c)
    {
        coverage = c;
    }

    //return amount of paint (number of gallons)
    //needed to paint the shape given as parameter
    public double amount(Shape s)
    {
        System.out.println ("Computing amount for " + s);
        return s.area()/coverage;
    }
}
