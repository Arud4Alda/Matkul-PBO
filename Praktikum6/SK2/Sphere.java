public class Sphere extends Shape
{
    private double radius;

    //construktor
    public Sphere(double r)
    {
        super("Sphere");
        radius = r;
    }

    //return surpace area sphere
    public double area()
    {
        return 4*Math.PI*radius*radius;
    }

    //return sphere as string
    public String toString()
    {
        return super.toString() + " of radius " + radius;
    }
}