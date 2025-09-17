package id.ac.polban.koperasi.model;
public class pelanggan {
    //atribut
    private String idpelanggan;
    private String namaplgn;

    // Constructor
    public pelanggan(String idpelanggan, String namaplgn)
    {
        this.idpelanggan = idpelanggan;
        this.namaplgn = namaplgn;
    }

    public String getidpelanggan() 
    {
        return idpelanggan;
    }

    public String getnamaplgn() 
    {
        return namaplgn;
    }

    public void tampilkanpelanggan() 
    {
        System.out.println("ID Pelanggan : " + idpelanggan);
        System.out.println("Nama         : " + namaplgn + "\n");
    }
}
