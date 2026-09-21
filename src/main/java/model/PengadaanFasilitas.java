package model;

public class PengadaanFasilitas extends FasilitasPosyandu {

    private int jumlahDibutuhkan;
    private double estimasiBiaya;
    private String statusPengadaan;

    public PengadaanFasilitas(
            String idPengadaan,
            String namaFasilitas,
            int jumlahDibutuhkan,
            double estimasiBiaya,
            String statusPengadaan) {

        super(idPengadaan, namaFasilitas);

        this.jumlahDibutuhkan = jumlahDibutuhkan;
        this.estimasiBiaya = estimasiBiaya;
        this.statusPengadaan = statusPengadaan;
    }

    // Getter dan Setter ID
    public String getIdPengadaan() {
        return getId();
    }

    public void setIdPengadaan(String idPengadaan) {
        setId(idPengadaan);
    }

    // Getter dan Setter Nama
    public String getNamaFasilitas() {
        return getNama();
    }

    public void setNamaFasilitas(String namaFasilitas) {
        setNama(namaFasilitas);
    }

    // Getter dan Setter Jumlah
    public int getJumlahDibutuhkan() {
        return jumlahDibutuhkan;
    }

    public void setJumlahDibutuhkan(int jumlahDibutuhkan) {
        this.jumlahDibutuhkan = jumlahDibutuhkan;
    }

    // Getter dan Setter Estimasi Biaya
    public double getEstimasiBiaya() {
        return estimasiBiaya;
    }

    public void setEstimasiBiaya(double estimasiBiaya) {
        this.estimasiBiaya = estimasiBiaya;
    }

    // Getter dan Setter Status
    public String getStatusPengadaan() {
        return statusPengadaan;
    }

    public void setStatusPengadaan(String statusPengadaan) {
        this.statusPengadaan = statusPengadaan;
    }

    // Polymorphism - method overriding
    @Override
    public void tampilkanInfo() {
        System.out.printf(
                "| %-8s | %-22s | %-6d | Rp %-12.2f | %-12s |%n",
                getIdPengadaan(),
                getNamaFasilitas(),
                jumlahDibutuhkan,
                estimasiBiaya,
                statusPengadaan
        );
    }
}