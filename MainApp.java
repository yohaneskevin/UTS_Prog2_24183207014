// File: MainApp.java

import java.util.ArrayList; // Untuk menyimpan banyak objek Mahasiswa
import java.util.Scanner; // Untuk input dari user

public class MainApp {
    // Variabel global dalam kelas MainApp (ArrayList untuk menyimpan objek Mahasiswa)
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Variabel lokal dalam method main()
        int pilihan = 0;

        do {
            tampilkanMenu();
            
            // Handle input non-integer
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membuang newline character
                prosesPilihan(pilihan);
            } else {
                System.out.println("\n[!] Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine(); // Membuang input yang salah
                pilihan = 0; // Agar loop terus berjalan
            }

        } while (pilihan != 3); // Keluar dari program jika pilihan = 3
    }
    
    // Method lokal untuk menampilkan menu
    private static void tampilkanMenu() {
        System.out.println("\n=====================================");
        System.out.println("           MENU UTAMA DATA MHS       ");
        System.out.println("=====================================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Semua Data");
        System.out.println("3. Keluar dari Program");
        System.out.print("Masukkan pilihan Anda (1-3): ");
    }

    // Method lokal untuk memproses pilihan menu
    private static void prosesPilihan(int pilihan) {
        // Variabel lokal dalam method prosesPilihan()
        switch (pilihan) {
            case 1:
                tambahData();
                break;
            case 2:
                tampilkanSemuaData();
                break;
            case 3:
                System.out.println("\n[INFO] Terima kasih! Program diakhiri.");
                break;
            default:
                System.out.println("\n[!] Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    // Method lokal untuk menambah data Mahasiswa
    private static void tambahData() {
        // Variabel lokal dalam method tambahData()
        String nim, nama;
        int umur;
        
        System.out.println("\n--- Menambah Data Mahasiswa ---");
        System.out.print("Masukkan NIM    : ");
        nim = scanner.nextLine(); // Variabel lokal nim
        
        System.out.print("Masukkan Nama   : ");
        nama = scanner.nextLine(); // Variabel lokal nama
        
        System.out.print("Masukkan Umur   : ");
        // Memastikan input umur adalah integer
        if (scanner.hasNextInt()) {
            umur = scanner.nextInt(); // Variabel lokal umur
            scanner.nextLine(); // Membuang newline
        } else {
            System.out.println("[!] Input umur tidak valid. Data tidak ditambahkan.");
            scanner.nextLine();
            return;
        }

        // Membuat objek Mahasiswa baru menggunakan konstruktor berparameter
        Mahasiswa mhsBaru = new Mahasiswa(nim, nama, umur);
        // Menambahkan objek ke ArrayList global
        daftarMahasiswa.add(mhsBaru);
        
        System.out.println("\n[SUKSES] Data Mahasiswa atas nama " + nama + " berhasil ditambahkan.");
    }

    // Method lokal untuk menampilkan semua data Mahasiswa
    private static void tampilkanSemuaData() {
        System.out.println("\n--- Menampilkan Semua Data Mahasiswa (" + daftarMahasiswa.size() + " data) ---");
        
        // Memeriksa apakah list kosong
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("[INFO] Belum ada data mahasiswa yang tersimpan.");
            return;
        }

        // Looping untuk menampilkan setiap objek Mahasiswa
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanData(); // Memanggil method tampilkanData() dari objek Mahasiswa
        }
    }
}