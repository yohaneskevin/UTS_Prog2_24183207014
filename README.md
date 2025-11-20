# UTS_Prog2_24183207014

Nama:Yohanes Kevin Victorian

NPM : 24183207014

Kelas: Pendidikan Teknologi Informasi/3A

1. Class Mahasiswa
Class ini adalah Class Objek yang bertindak sebagai representasi dari entitas "Mahasiswa" di dunia nyata.

Class: Mahasiswa

Atribut:

private String nim;

private String nama;

private int umur;

Semua atribut ini bersifat private, yang berarti hanya bisa diakses dan diubah di dalam Class Mahasiswa itu sendiri (melalui Getter dan Setter).

2. Class MainApp
Class ini adalah Class Utama yang berisi logika aplikasi untuk menjalankan sistem manajemen data Mahasiswa.

Class: MainApp

Atribut:

private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); (Digunakan untuk menyimpan kumpulan objek Mahasiswa)

private static Scanner scanner = new Scanner(System.in); (Digunakan untuk menangani input dari user)

Kedua atribut ini bersifat static,berarti hanya ada satu salinan variabel yang dibagikan ke semua instance Class (dalam kasus ini, hanya ada satu instance yang digunakan).


contoh output:

<img width="500" height="264" alt="image" src="https://github.com/user-attachments/assets/91c27d25-edb7-4d67-8cb2-c56a6c42324d" />
<img width="440" height="353" alt="image" src="https://github.com/user-attachments/assets/51f01d2f-f734-428c-93c9-e4c5b5f6e36d" />





