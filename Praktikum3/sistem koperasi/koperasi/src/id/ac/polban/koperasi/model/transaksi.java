package id.ac.polban.koperasi.model;

public class transaksi 
{
    //atribut
    private String idtransaksi;
    private petugas namaptgs;   
    private pelanggan namaplgn;
    private barang namabrg;
    private int jumlah;
    private int totalharga;
    private String tanggal;

    // Constructor
    public transaksi(String idtransaksi, petugas namaptgs, pelanggan namaplgn, barang namabrg, int jumlah, int totalharga, String tanggal)
    {
        this.idtransaksi = idtransaksi;
        this.namaptgs = namaptgs;
        this.namaplgn = namaplgn;
        this.namabrg = namabrg;
        this.jumlah = jumlah;
        this.totalharga = totalharga;
        this.tanggal = tanggal;
    }

    public String getidtransaksi() 
    {
        return idtransaksi;
    }

    public int getttlharga() 
    {
        return totalharga;
    }

    public petugas getnamaptgs() { return namaptgs; }
    public pelanggan getnamaplgn() { return namaplgn; }
    public barang getnamabrg() { return namabrg; }


    public void tampilkanstruk()
    {
        System.out.println("\n=== STRUK TRANSAKSI ===");
        System.out.println("ID Transaksi : " + idtransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Pelanggan    : " + namaplgn.getnamaplgn());
        System.out.println("Petugas      : " + namaptgs.getnamaptgs());
        System.out.println("Barang       : " + namabrg.getnamabrg() + " x " + jumlah);
        System.out.println("Total Harga  : " + totalharga);
        System.out.println("=======================");
    }

    @Override
    public String toString() {
        return "\n=== STRUK TRANSAKSI ===" +
            "\nID Transaksi : " + idtransaksi +
            "\nTanggal      : " + tanggal +
            "\nPelanggan    : " + namaplgn.getnamaplgn() +
            "\nPetugas      : " + namaptgs.getnamaptgs() +
            "\nBarang       : " + namabrg.getnamabrg() + " x " + jumlah +
            "\nTotal Harga  : Rp " + totalharga +
            "\n=======================";
    }
}
