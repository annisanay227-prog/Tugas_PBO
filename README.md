# Sistem Manajemen Posyandu
Sistem sederhana berbasis CLI (Command Line Interface) untuk membantu kader dan pengelola posyandu dalam mencatat inventaris alat kesehatan serta mengelola rencana pengadaan fasilitas baru menggunakan konsep Pemrograman Berbasis Objek (PBO) di Java.

---

## 1. Deskripsi Singkat Program
Program ini dirancang untuk memudahkan pengelola posyandu dalam mencatat, memantau, serta mengelola daftar alat kesehatan dan rencana pengadaan fasilitas secara dinamis. Fitur utama mencakup operasi **CRUD (Create, Read, Update, Delete)** yang memungkinkan pengguna menambahkan alat kesehatan atau pengajuan fasilitas baru, melihat daftar fasilitas dalam bentuk tabel, memperbarui status pengadaan atau kondisi alat, dan menghapus data yang tidak lagi relevan.

## 2. Struktur Class & Package
Proyek ini terdiri dari **3 class utama** di dalam package `model` dan `service`, serta **1 class entry point** di package `main`:

* **Package `model`**
  * **AlatPosyandu.java** (Class Entitas Data Alat Kesehatan)
    * `idAlat`
    * `namaAlat`
    * `kategori`
    * `jumlah`
    * `kondisi`
   
 * **PengadaanFasilitas.java** (Class Entitas Data Rencana Pengadaan)
    * `idPengadaan`
    * `namaFasilitas`
    * `jumlahDibutuhkan`
    * `estimasiBiaya`
    * `statusPengadaan`

* **Package `service`**
  * **SistemPosyandu.java** (Class Pengolah Logika CRUD & Penyimpanan Data)
    * `daftarAlat` (ArrayList<AlatPosyandu>)
    * `daftarPengadaan` (ArrayList<PengadaanFasilitas>)
 **Package `main`**
  * **Main.java** (Entry Point Program & Pengolah Input CLI)
    * `scanner` (Scanner)
    * `sistem` (SistemPosyandu)
   
## 3. Penjelasan Penerapan Inheritance
Penerapan Inheritance atau pewarisan terletak pada relasi antara superclass AlatPosyandu dengan subclass AlatDigital dan Alat Manual.

## 4. Kode Sumber Subclass (AlatDigital.java):
Subclass menggunakan kata kunci extends untuk mewarisi atribut dari AlatPosyandu dan memanggil konstruktor superclass menggunakan super().

## 5. Penjelasan Tiap Class

* **AlatPosyandu.java**
  * Berfungsi sebagai class entitas penampung data individu untuk setiap alat kesehatan di posyandu.
  * Menerapkan prinsip *encapsulation* dengan access modifier `private` pada seluruh atributnya.
  * Dilengkapi *constructor*, *getter*, *setter*, serta method `tampilkanInfo()` untuk memformat tampilan data alat ke dalam bentuk baris tabel.

* **PengadaanFasilitas.java**
  * Berfungsi sebagai class entitas penampung data rencana pengajuan atau status pengadaan fasilitas baru.
  * Menerapkan prinsip *encapsulation* pada atribut-atributnya seperti `idPengadaan`, `namaFasilitas`, `jumlahDibutuhkan`, `estimasiBiaya`, dan `statusPengadaan`.
  * Dilengkapi *constructor*, *getter*, *setter*, serta method `tampilkanInfo()` untuk mencetak baris data pengadaan.
