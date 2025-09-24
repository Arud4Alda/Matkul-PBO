package goods;

public interface Taxable {
    double taxRate = 0.06;
    
    public double calculateTax();
}