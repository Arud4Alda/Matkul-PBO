import java.text.DecimalFormat;
public class PaintThings
{
    public static void main(String[] args) 
    {
        final double COVERAGE  = 350;
        Paint paint = new Paint(COVERAGE);  
        Rectangle desk;
        Sphere bigBall;
        Cylinder tank;

        double deckAmt, ballAmt, tankAmt;

        //instantiate the three shape to paint
        desk = new Rectangle(20.0, 35.0);
        bigBall = new Sphere(15.0);
        tank = new Cylinder(10.0, 30.0);
        //compute the amount of paint needed for each shape
        deckAmt = paint.amount(desk);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        //print amount of paint each shape
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of galon of paint neede...");
        System.out.println("Deck: "+ fmt.format(deckAmt));
        System.out.println("Big Ball: "+ fmt.format(ballAmt));
        System.out.println("Tank: "+ fmt.format(tankAmt));
    }
}
