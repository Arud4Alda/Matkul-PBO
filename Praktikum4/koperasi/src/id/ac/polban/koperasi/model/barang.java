package id.ac.polban.koperasi.model;

public class barang 
{
    //atribut
    private String idbarang;
    private int harga;
    private int stok;   
    
    // Konstructor
    public barang(String idbarang, int harga, int stok)
    {
        this.idbarang = idbarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getidbarang() 
    {
        return idbarang;
    }

    public int getharga() 
    {
        return harga;
    }

    public int getstok() 
    {
        return stok;
    }

    public String getnamabrg() {
        return "Barang tidak diketahui";
    }

    public String getjenisbrg() {
        return "Jenis tidak diketahui";
    }

    public String getmerkbrg() {
        return "Merk tidak diketahui";
    }

    public void kurangistok(int jumlah) 
    {
        if (stok >= jumlah) stok -= jumlah;
        else System.out.println("⚠ Stok tidak cukup!");
    }

    public void tampilkanbarang() {
        System.out.println("ID Barang : " + idbarang);
        System.out.println("Harga     : " + harga);
        System.out.println("Stok      : " + stok + "\n");
    }

    public String toString() {
        return "ID Barang: " + idbarang + "\n" +
               "Harga    : " + harga + "\n" +
               "Stok     : " + stok + "\n";
    }
}
