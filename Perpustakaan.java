
// Class Perpustakaan
import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> koleksiBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void displayKoleksiBuku() {
        System.out.println("Koleksi Buku:");
        for (Buku buku : koleksiBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang());
        }
    }

    public void displayDaftarAnggota() {
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : daftarAnggota) {
            System.out.println("Nama: " + anggota.getNama() + ", Alamat: " + anggota.getAlamat());
        }
    }
}
