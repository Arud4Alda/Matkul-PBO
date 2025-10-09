
import java.util.Scanner;
public class Numbers
{
    public static void main(String[] args) {
        Integer[] intlist;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intlist = new Integer[size];

        System.out.println("\nEnter the number...");
        for (int i=0; i<size; i++)
            intlist[i] = scan.nextInt();

        Sorting.insertionSort(intlist);

        System.out.println("\nYour number shorted order..");
        for(int i =0; i<size; i++)
            System.out.println(intlist[i]+"  ");
        System.out.println();
    }
}
