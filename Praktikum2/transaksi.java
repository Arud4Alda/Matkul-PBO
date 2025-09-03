public class transaksi 
{
    //atribut
    private String idtransaksi;
    private String namaptgs;   
    private String namaplgn;
    private String namabrg;
    private int jumlah;
    private int totalharga;
    private String tanggal;

    // Constructor
    public transaksi(String idtransaksi, String namaptgs, String namaplgn, String namabrg, int jumlah, int totalharga, String tanggal)
    {
        this.idtransaksi = idtransaksi;
        this.namaptgs = namaptgs;
        this.namaplgn = namaplgn;
        this.namabrg = namabrg;
        this.jumlah = jumlah;
        this.totalharga = totalharga;
        this.tanggal = tanggal;
    }

    public void tampilkanstruk()
    {
        System.out.println("\n=== STRUK TRANSAKSI ===");
        System.out.println("ID Transaksi : " + idtransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Pelanggan    : " + namaplgn);
        System.out.println("Petugas      : " + namaptgs);
        System.out.println("Barang       : " + namabrg + " x " + jumlah);
        System.out.println("Total Harga  : " + totalharga);
        System.out.println("=======================");
    }
}
