public class petugas 
{
    //atribut
    private String idpetugas;
    private String namaptgs;
    private String alamat;
    private String telepon;

    // Konstructor
    public petugas(String idpetugas, String namaptgs, String alamat, String telepon)
    {
        this.idpetugas = idpetugas;
        this.namaptgs = namaptgs;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getidpetugas() 
    {
        return idpetugas;
    }

    public String getnamaptgs() 
    {
        return namaptgs;
    }

    public void tammpilkanpetugas() 
    {
        System.out.println("ID Petugas : " + idpetugas + "\n");
        System.out.println("Nama       : " + namaptgs + "\n");
        System.out.println("Alamat     : " + alamat + "\n");
        System.out.println("Telepon    : " + telepon);
    }
}
