package goods;

public class Main {
    public static void main (String [] Args)
    {
        Food f = new Food("Roti", 10000, 250);
        f.display();

        System.out.println();

        Toy t = new Toy("Lego", 200000, 7);
        t.display();

        System.out.println();

        Book b = new Book("Java Programming", 150000, "James Gosling");
        b.display();
    }
    
}
