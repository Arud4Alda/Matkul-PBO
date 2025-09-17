package id.ac.polban.koperasi.model;

public class petugas extends Orang
{
    //atribut
    private String alamat;
    private String telepon;

    // Konstructor
    public petugas(String idpetugas, String namaptgs, String alamat, String telepon)
    {
        super(idpetugas, namaptgs);
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getidpetugas() 
    {
        return super.getId();
    }

    public String getnamaptgs() 
    {
        return super.getNama();
    }

    public void tammpilkanpetugas() 
    {
        System.out.println("ID Petugas : " + getidpetugas());
        System.out.println("Nama       : " + getnamaptgs());
        System.out.println("Alamat     : " + alamat);
        System.out.println("Telepon    : " + telepon+ "\n");
    }
}
