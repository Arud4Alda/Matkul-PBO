package id.ac.polban.koperasi.model;

public class Orang 
{
    //atribut
    private String id;
    private String nama;

    //constructor no args
    public Orang() {
        id = "99";
        nama = "Alda Pujama";
    }

    //constructor args
    public Orang(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    //getter and setter
    public String getId() {
        return id;
    }

    public String setId(String id) {
        return this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }
}
