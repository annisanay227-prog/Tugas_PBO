package main;

import model.AlatPosyandu;
import model.PengadaanFasilitas;
import service.SistemPosyandu;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemPosyandu sistem = new SistemPosyandu();

    public static void main(String[] args) {
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n==================================================");
            System.out.println("   SISTEM MANAJEMEN FASILITAS & PENDATAAN POSYANDU");
            System.out.println("==================================================");
            System.out.println("1. Kelola Pendataan Alat Posyandu");
            System.out.println("2. Kelola Rencana Pengadaan Fasilitas");
            System.out.println("0. Keluar Aplikasi");
            
            int pilihan = inputInteger("Pilih Menu Utama [0-2]: ");

            switch (pilihan) {
                case 1:
                    menuAlat();
                    break;
                case 2:
                    menuPengadaan();
                    break;
                case 0:
                    berjalan = false;
                    System.out.println("\n[!] Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("[!] Pilihan menu tidak valid.");
            }
        }
    }

    private static void menuAlat() {
        boolean kembali = false;
        while (!kembali) {
            System.out.println("\n--- MENU PENDATAAN ALAT POSYANDU ---");
            System.out.println("1. Tampilkan Semua Alat");
            System.out.println("2. Tambah Alat Baru");
            System.out.println("3. Ubah Data Alat");
            System.out.println("4. Hapus Data Alat");
            System.out.println("0. Kembali ke Menu Utama");

            int pilihan = inputInteger("Pilih opsi [0-4]: ");

            switch (pilihan) {
                case 1:
                    sistem.tampilkanSemuaAlat();
                    break;
                case 2:
                    System.out.print("Masukkan ID Alat (contoh: ALT-003): ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Alat: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kategori: ");
                    String kategori = scanner.nextLine();
                    int jumlah = inputInteger("Masukkan Jumlah: ");
                    System.out.print("Masukkan Kondisi (Baik/Perlu Kalibrasi/Rusak): ");
                    String kondisi = scanner.nextLine();

                    sistem.tambahAlat(new AlatPosyandu(id, nama, kategori, jumlah, kondisi));
                    break;
                case 3:
                    sistem.tampilkanSemuaAlat();
                    System.out.print("Masukkan ID Alat yang ingin diubah: ");
                    String idEdit = scanner.nextLine();
                    if (sistem.cariAlatById(idEdit) != null) {
                        System.out.print("Nama Baru: ");
                        String namaBaru = scanner.nextLine();
                        System.out.print("Kategori Baru: ");
                        String kategoriBaru = scanner.nextLine();
                        int jumlahBaru = inputInteger("Jumlah Baru: ");
                        System.out.print("Kondisi Baru: ");
                        String kondisiBaru = scanner.nextLine();

                        sistem.updateAlat(idEdit, namaBaru, kategoriBaru, jumlahBaru, kondisiBaru);
                    } else {
                        System.out.println("[!] ID Alat tidak ditemukan.");
                    }
                    break;
                case 4:
                    sistem.tampilkanSemuaAlat();
                    System.out.print("Masukkan ID Alat yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    sistem.hapusAlat(idHapus);
                    break;
                case 0:
                    kembali = true;
                    break;
                default:
                    System.out.println("[!] Opsi tidak valid.");
            }
        }
    }

    private static void menuPengadaan() {
        boolean kembali = false;
        while (!kembali) {
            System.out.println("\n--- MENU PENGADAAN FASILITAS ---");
            System.out.println("1. Tampilkan Semua Pengadaan");
            System.out.println("2. Tambah Rencana Pengadaan");
            System.out.println("3. Update Status Pengadaan");
            System.out.println("4. Hapus Rencana Pengadaan");
            System.out.println("0. Kembali ke Menu Utama");

            int pilihan = inputInteger("Pilih opsi [0-4]: ");

            switch (pilihan) {
                case 1:
                    sistem.tampilkanSemuaPengadaan();
                    break;
                case 2:
                    System.out.print("Masukkan ID Pengadaan (contoh: PGD-002): ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Fasilitas: ");
                    String nama = scanner.nextLine();
                    int jumlah = inputInteger("Masukkan Jumlah Dibutuhkan: ");
                    double biaya = inputDouble("Masukkan Estimasi Biaya (Rp): ");
                    System.out.print("Masukkan Status (Diajukan/Disetujui/Proses): ");
                    String status = scanner.nextLine();

                    sistem.tambahPengadaan(new PengadaanFasilitas(id, nama, jumlah, biaya, status));
                    break;
                case 3:
                    sistem.tampilkanSemuaPengadaan();
                    System.out.print("Masukkan ID Pengadaan yang diupdate: ");
                    String idEdit = scanner.nextLine();
                    if (sistem.cariPengadaanById(idEdit) != null) {
                        System.out.print("Status Baru (Diajukan/Disetujui/Ditolak/Selesai): ");
                        String statusBaru = scanner.nextLine();
                        sistem.updateStatusPengadaan(idEdit, statusBaru);
                    } else {
                        System.out.println("[!] ID Pengadaan tidak ditemukan.");
                    }
                    break;
                case 4:
                    sistem.tampilkanSemuaPengadaan();
                    System.out.print("Masukkan ID Pengadaan yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    sistem.hapusPengadaan(idHapus);
                    break;
                case 0:
                    kembali = true;
                    break;
                default:
                    System.out.println("[!] Opsi tidak valid.");
            }
        }
    }

    private static int inputInteger(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[Error] Input harus berupa angka bulat! Silakan coba lagi.");
            }
        }
    }

    private static double inputDouble(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[Error] Input harus berupa angka desimal/nominal! Silakan coba lagi.");
            }
        }
    }
}