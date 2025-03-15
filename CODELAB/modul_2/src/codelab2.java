import java.text.DecimalFormat;

class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    private DecimalFormat formatter = new DecimalFormat("0.00");

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // Menampilkan Informasi Rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Saldo         : Rp. " + formatter.format(saldo));
        System.out.println();
    }

    // Setor Uang
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor uang Rp. " + formatter.format(jumlah) +
                    " | Saldo sekarang: Rp. " + formatter.format(saldo));
        } else {
            System.out.println("(Gagal, jumlah setor harus lebih dari 0!)");
        }
    }

    // Tarik Uang
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik uang Rp. " + formatter.format(jumlah) +
                    " | Saldo sekarang: Rp. " + formatter.format(saldo));
        } else {
            System.out.println("(Gagal, saldo tidak mencukupi atau jumlah tidak valid!)");
        }
    }
}

// Kelas Main
public class codelab2 {
    public static void main(String[] args) {
        RekeningBank firstRekening = new RekeningBank("202410370110098", "miqdad abdurahman", 20000000);
        RekeningBank secondRekening = new RekeningBank("123456789101112", "Anonymous", 30000000);

        System.out.println("=== Rekening 1 ===");
        firstRekening.tampilkanInfo();

        System.out.println("=== Rekening 2 ===");
        secondRekening.tampilkanInfo();

        System.out.println("=== Info Setor Uang ===");
        firstRekening.setorUang(5000000);
        secondRekening.setorUang(10000000);
        System.out.println();

        System.out.println("=== Info Tarik Uang ===");
        firstRekening.tarikUang(10000000);
        secondRekening.tarikUang(5000000);
        System.out.println();

        System.out.println("=== Data Setelah Transaksi ===");
        firstRekening.tampilkanInfo();
        secondRekening.tampilkanInfo();
    }
}
