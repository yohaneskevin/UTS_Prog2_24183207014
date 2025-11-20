// File: Mahasiswa.java

public class Mahasiswa {
    // Variabel Global (Atribut)
    private String nim; // Variabel global (atribut) Mahasiswa
    private String nama; // Variabel global (atribut) Mahasiswa
    private int umur; // Variabel global (atribut) Mahasiswa

    // 1. Konstruktor Default (tanpa parameter)
    public Mahasiswa() {
        // Inisialisasi default jika diperlukan
        this.nim = "";
        this.nama = "Belum Ada Nama";
        this.umur = 0;
    }

    // 2. Konstruktor Berparameter (untuk mengisi nilai awal atribut)
    public Mahasiswa(String nim, String nama, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
    }

    // --- Method Setter (set) ---
    public void setNim(String nimBaru) {
        this.nim = nimBaru;
    }

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void setUmur(int umurBaru) {
        this.umur = umurBaru;
    }

    // --- Method Getter (get) ---
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // --- Method Tambahan ---
    // Method untuk menampilkan isi objek
    public void tampilkanData() {
        System.out.println("-------------------------------------");
        System.out.println("Data Mahasiswa:");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("-------------------------------------");
    }
}