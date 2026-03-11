//deklarasi class
class Buku {
    //atribut
    String judul;
    String pengarang;
    int harga;

    //Constructor Tanpa parameter
    public Buku(){
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }
    //Constructor 3 parameter
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp "+ harga);
        System.out.println();
    }
}

public class LatihanBukuConstructor{
    public static void main(String[] args) {
        //deklarasi object buku pertama dengan constructor default
        Buku buku1 = new Buku();
        //deklarasi object buku kedua dengan constructor 3 parameter
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000 );
        //deklarasi object buku ketiga dengan constructor 3 parameter
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        // Panggil method pada buku 1
        buku1.tampilkanInfo();
        // Panggil method pada buku 2
        buku2.tampilkanInfo();
        // Panggil method pada buku 3
        buku3.tampilkanInfo();
    }
}