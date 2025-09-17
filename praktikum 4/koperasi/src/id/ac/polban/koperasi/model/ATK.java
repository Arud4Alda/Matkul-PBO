package id.ac.polban.koperasi.model;

public class ATK extends barang
{
    private String namabrg;
    private String jenisbrg;
    private String merkbrg;

    public ATK(String idbarang, int harga, int stok, String namabrg, String jenisbrg, String merkbrg) {
        // Memanggil constructor superclass dengan super()
        super(idbarang, harga, stok);
        this.namabrg = namabrg;
        this.jenisbrg = jenisbrg;
        this.merkbrg = merkbrg;
    }

    // Metode getter yang di-override
    @Override
    public String getnamabrg() {
        return namabrg;
    }
    @Override
    public String getjenisbrg() {
        return jenisbrg;
    }
    @Override
    public String getmerkbrg() {
        return merkbrg;
    }
    
     @Override
    public void tampilkanbarang() {
        // Memanggil metode superclass
        super.tampilkanbarang();
        System.out.println("Nama      : " + namabrg);
        System.out.println("Jenis     : " + jenisbrg);
        System.out.println("Merk      : " + merkbrg);
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "Nama     : " + namabrg + "\n" +
               "Jenis    : " + jenisbrg + "\n" +
               "Merk     : " + merkbrg + "\n";
    }
}
