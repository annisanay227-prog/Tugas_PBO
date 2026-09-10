package model;

public class PengadaanFasilitas {
    private String idPengadaan;
    private String namaFasilitas;
    private int jumlahDibutuhkan;
    private double estimasiBiaya;
    private String statusPengadaan;

    public PengadaanFasilitas(String idPengadaan, String namaFasilitas, int jumlahDibutuhkan, double estimasiBiaya, String statusPengadaan) {
        this.idPengadaan = idPengadaan;
        this.namaFasilitas = namaFasilitas;
        this.jumlahDibutuhkan = jumlahDibutuhkan;
        this.estimasiBiaya = estimasiBiaya;
        this.statusPengadaan = statusPengadaan;
    }

    public String getIdPengadaan() {
        return idPengadaan;
    }

    public void setIdPengadaan(String idPengadaan) {
        this.idPengadaan = idPengadaan;
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public void setNamaFasilitas(String namaFasilitas) {
        this.namaFasilitas = namaFasilitas;
    }

    public int getJumlahDibutuhkan() {
        return jumlahDibutuhkan;
    }

    public void setJumlahDibutuhkan(int jumlahDibutuhkan) {
        this.jumlahDibutuhkan = jumlahDibutuhkan;
    }

    public double getEstimasiBiaya() {
        return estimasiBiaya;
    }

    public void setEstimasiBiaya(double estimasiBiaya) {
        this.estimasiBiaya = estimasiBiaya;
    }

    public String getStatusPengadaan() {
        return statusPengadaan;
    }

    public void setStatusPengadaan(String statusPengadaan) {
        this.statusPengadaan = statusPengadaan;
    }

    public void tampilkanInfo() {
        System.out.printf("| %-8s | %-22s | %-6d | Rp %-12.2f | %-12s |%n", 
            idPengadaan, namaFasilitas, jumlahDibutuhkan, estimasiBiaya, statusPengadaan);
    }
}