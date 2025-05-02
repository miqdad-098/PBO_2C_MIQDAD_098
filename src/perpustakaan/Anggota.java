package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul \"" + judul + "\".");
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku() {
        System.out.println(nama + " mengembalikan buku.");
    }

    public void display() {
        System.out.println("ID: " + idAnggota + " | Nama: " + nama);
    }
}
