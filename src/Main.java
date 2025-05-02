import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("miqdad", "098");
        Anggota anggota2 = new Anggota("ari", "111");

        Buku buku1 = new Fiksi("harry potter", "jk rowley");
        Buku buku2 = new NonFiksi("meditation", "marcus aurelius");

        anggota1.display();
        buku1.displayInfo();
        anggota1.pinjamBuku(buku1.getJudul());

        System.out.println();

        anggota2.display();
        buku2.displayInfo();
        anggota2.pinjamBuku(buku2.getJudul(), 7);
        anggota2.kembalikanBuku();
    }
}
