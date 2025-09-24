package goods;

public class Book extends Goods implements Taxable{
    private String Author;

    public Book(String description, double price, String Author) {
        super(description, price);
        this.Author = Author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }
    
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + Author);
        System.out.println("Tax: " + calculateTax());
    }
}
