package model;

public class FasilitasPosyandu {

    private String id;
    private String nama;

    public FasilitasPosyandu(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk polymorphism
    public void tampilkanInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
    }
}