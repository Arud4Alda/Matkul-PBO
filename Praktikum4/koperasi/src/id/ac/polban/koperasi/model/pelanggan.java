package id.ac.polban.koperasi.model;
public class pelanggan extends Orang{
    
    // Constructor
    public pelanggan(String idpelanggan, String namaplgn)
    {
        super(idpelanggan,namaplgn);
    }

    public String getidpelanggan() 
    {
        return super.getId();
    }

    public String getnamaplgn() 
    {
        return super.getNama();
    }

    public void tampilkanpelanggan() 
    {
        System.out.println("ID Pelanggan : " + getidpelanggan());
        System.out.println("Nama         : " + getnamaplgn() + "\n");
    }
}
