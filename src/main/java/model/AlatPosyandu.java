package model;

public class AlatPosyandu {
    private String idAlat;
    private String namaAlat;
    private String kategori;
    private int jumlah;
    private String kondisi;

    public AlatPosyandu(String idAlat, String namaAlat, String kategori, int jumlah, String kondisi) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }

    public String getIdAlat() {
        return idAlat;
    }

    public void setIdAlat(String idAlat) {
        this.idAlat = idAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void tampilkanInfo() {
        System.out.printf("| %-8s | %-20s | %-15s | %-6d | %-15s |%n", 
            idAlat, namaAlat, kategori, jumlah, kondisi);
    }
}