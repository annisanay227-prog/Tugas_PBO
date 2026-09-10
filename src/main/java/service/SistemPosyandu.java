package service;

import model.AlatPosyandu;
import model.PengadaanFasilitas;
import java.util.ArrayList;

public class SistemPosyandu {
    private ArrayList<AlatPosyandu> daftarAlat;
    private ArrayList<PengadaanFasilitas> daftarPengadaan;

    public SistemPosyandu() {
        daftarAlat = new ArrayList<>();
        daftarPengadaan = new ArrayList<>();
        
        // Data Awal (Dummy Data)
        daftarAlat.add(new AlatPosyandu("ALT-001", "Timbangan Dacin", "Pengukuran", 2, "Baik"));
        daftarAlat.add(new AlatPosyandu("ALT-002", "Tensimeter Digital", "Pemeriksaan", 1, "Perlu Kalibrasi"));
        
        daftarPengadaan.add(new PengadaanFasilitas("PGD-001", "Pita LILA Digital", 3, 450000.0, "Diajukan"));
    }

    // CRUD ALAT POSYANDU
    public void tambahAlat(AlatPosyandu alat) {
        daftarAlat.add(alat);
        System.out.println("[+] Berhasil menambahkan data alat kesehatan baru.");
    }

    public void tampilkanSemuaAlat() {
        if (daftarAlat.isEmpty()) {
            System.out.println("[!] Belum ada data alat kesehatan.");
            return;
        }
        System.out.println("\n--- DAFTAR ALAT KESEHATAN POSYANDU ---");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-8s | %-20s | %-15s | %-6s | %-15s |%n", "ID", "Nama Alat", "Kategori", "Jumlah", "Kondisi");
        System.out.println("-----------------------------------------------------------------------");
        for (AlatPosyandu alat : daftarAlat) {
            alat.tampilkanInfo();
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public void updateAlat(String id, String namaBaru, String kategoriBaru, int jumlahBaru, String kondisiBaru) {
        AlatPosyandu alat = cariAlatById(id);
        if (alat != null) {
            alat.setNamaAlat(namaBaru);
            alat.setKategori(kategoriBaru);
            alat.setJumlah(jumlahBaru);
            alat.setKondisi(kondisiBaru);
            System.out.println("[+] Data alat berhasil diperbarui.");
        } else {
            System.out.println("[!] Data alat dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void hapusAlat(String id) {
        AlatPosyandu alat = cariAlatById(id);
        if (alat != null) {
            daftarAlat.remove(alat);
            System.out.println("[+] Data alat berhasil dihapus.");
        } else {
            System.out.println("[!] Data alat dengan ID " + id + " tidak ditemukan.");
        }
    }

    public AlatPosyandu cariAlatById(String id) {
        for (AlatPosyandu alat : daftarAlat) {
            if (alat.getIdAlat().equalsIgnoreCase(id)) {
                return alat;
            }
        }
        return null;
    }

    // CRUD PENGADAAN FASILITAS
    public void tambahPengadaan(PengadaanFasilitas pengadaan) {
        daftarPengadaan.add(pengadaan);
        System.out.println("[+] Berhasil menambahkan rencana pengadaan baru.");
    }

    public void tampilkanSemuaPengadaan() {
        if (daftarPengadaan.isEmpty()) {
            System.out.println("[!] Belum ada rencana pengadaan fasilitas.");
            return;
        }
        System.out.println("\n--- RENCANA PENGADAAN FASILITAS ---");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-8s | %-22s | %-6s | %-15s | %-12s |%n", "ID", "Nama Fasilitas", "Jumlah", "Estimasi Biaya", "Status");
        System.out.println("-----------------------------------------------------------------------");
        for (PengadaanFasilitas p : daftarPengadaan) {
            p.tampilkanInfo();
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public void updateStatusPengadaan(String id, String statusBaru) {
        PengadaanFasilitas p = cariPengadaanById(id);
        if (p != null) {
            p.setStatusPengadaan(statusBaru);
            System.out.println("[+] Status pengadaan berhasil diperbarui.");
        } else {
            System.out.println("[!] Data pengadaan dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void hapusPengadaan(String id) {
        PengadaanFasilitas p = cariPengadaanById(id);
        if (p != null) {
            daftarPengadaan.remove(p);
            System.out.println("[+] Data pengadaan berhasil dihapus.");
        } else {
            System.out.println("[!] Data pengadaan dengan ID " + id + " tidak ditemukan.");
        }
    }

    public PengadaanFasilitas cariPengadaanById(String id) {
        for (PengadaanFasilitas p : daftarPengadaan) {
            if (p.getIdPengadaan().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
}