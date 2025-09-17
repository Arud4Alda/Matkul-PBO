package task;

public class TestShape 
{
    public static void main(String[] args)
    {
        System.out.println("--- Testing Shape Class ---");
        // Create a Shape object using the no-arg constructor
        Shape s1 = new Shape();
        System.out.println(s1); // Uses the overridden toString()
        System.out.println("Color: " + s1.getColor());
        System.out.println("Is Filled: " + s1.isFilled());
        System.out.println(s1.toString());
        
        // Create a Shape object with specific values
        Shape s2 = new Shape("blue", false);
        System.out.println(s2);
        System.out.println("Color: " + s2.getColor());
        System.out.println("Is Filled: " + s2.isFilled());
        System.out.println(s2.toString());
        
        System.out.println("\n--- Testing Circle Class ---");
        // Create a Circle object using the no-arg constructor
        CircleShape c1 = new CircleShape();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println(c1.toString());
        
        // Create a Circle object with a specific radius
        CircleShape c2 = new CircleShape(5.0);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println(c2.toString());
        
        // Create a Circle object with all arguments
        CircleShape c3 = new CircleShape(3.5, "yellow", true);
        System.out.println(c3);
        System.out.println("Area: " + c3.getArea());
        System.out.println(c3.toString());
        
        System.out.println("\n--- Testing Rectangle Class ---");
        // Create a Rectangle object using the no-arg constructor
        RectangelShape r1 = new RectangelShape();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println(r1.toString());

        // Create a Rectangle object with specific width and length
        RectangelShape r2 = new RectangelShape(4.0, 6.0);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println(r2.toString());

        // Create a Rectangle object with all arguments
        RectangelShape r3 = new RectangelShape(2.5, 5.0, "orange", false);
        System.out.println(r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());
        System.out.println(r3.toString());

        System.out.println("\n--- Testing Square Class ---");
        // Create a Square object
        SquareShape sq1 = new SquareShape(7.0);
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
        System.out.println(sq1.toString());

        // Change the side of the square using a setter
        sq1.setWidth(10.0);
        System.out.println("\nAfter changing side to 10.0:");
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
        System.out.println(sq1.toString());
    }
}
