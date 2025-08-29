public class barang 
{
    //atribut
    private String idbarang;
    private String namabrg;
    private String jenis;
    private int harga;
    private int stok;   
    
    // Konstructor
    public barang(String idbarang, String nama, String jenis, int harga, int stok)
    {
        this.idbarang = idbarang;
        this.namabrg = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
    }

    public String getidbarang() 
    {
        return idbarang;
    }

    public String getnamabrg() 
    {
        return namabrg;
    }

    public int getharga() 
    {
        return harga;
    }

    public int getstok() 
    {
        return stok;
    }

    public void kurangistok(int jumlah) 
    {
        if (stok >= jumlah) stok -= jumlah;
        else System.out.println("⚠ Stok tidak cukup!");
    }

    public void tampilkanbarang() 
    {
        System.out.println("ID Barang : " + idbarang + "\n");
        System.out.println("Nama      : " + namabrg + "\n");
        System.out.println("Jenis     : " + jenis + "\n");
        System.out.println("Harga     : " + harga + "\n");
        System.out.println("Stok      : " + stok);
    }
}
