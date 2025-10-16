// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;
public class ParseInts 
{    
    public static void main(String[] args)
    {
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String token;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        try{
            while (scanLine.hasNext())
            {
                token = scanLine.next();
                try{
                    val = Integer.parseInt(token);
                    sum += val;
                }catch(NumberFormatException e){
                    System.out.println("lewati untuk "+ token + " karena bukan integer");
                }                                               
            }
        }  catch (Exception e) {}
        
        System.out.println("The sum of the integers on this line is " + sum);
        scanLine.close();
        scan.close();
    }
    
}
