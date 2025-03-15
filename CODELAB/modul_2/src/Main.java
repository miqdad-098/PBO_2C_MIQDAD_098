class hewan {
    String nama;
    String jenis;
    String suara;

    hewan(String nama , String jenis , String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;

    }
    void tampilakaninfo(){
        System.out.println("nama: "+nama);
        System.out.println("jenis: "+jenis);
        System.out.println("suara: "+suara);

    }
}
public class Main {
    public static void main(String[] args){
       hewan hewan1 = new hewan("kucing","mamalia","nyaam");
       hewan hewan2 = new hewan("anjing","mamalia","gokgok");

       hewan1.tampilakaninfo();
       hewan2.tampilakaninfo();

    }
}