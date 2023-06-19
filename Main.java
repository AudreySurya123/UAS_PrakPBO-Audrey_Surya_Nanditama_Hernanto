// Class Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat beberapa objek buku
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("5 cm", "Donny Dhirgantoro");

        // Membuat beberapa objek anggota
        Anggota anggota1 = new Anggota("Audrey Surya", "Jl. Cokroaminoto No 151");
        Anggota anggota2 = new Anggota("Sevyra Nanda", "Jl. Bareng Kamu No 515B");

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menambahkan anggota ke perpustakaan
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        // Menampilkan koleksi buku
        perpustakaan.displayKoleksiBuku();

        // Menampilkan daftar anggota
        perpustakaan.displayDaftarAnggota();
    }
}
