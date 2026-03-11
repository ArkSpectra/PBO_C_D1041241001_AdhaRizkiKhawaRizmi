//deklarasi class
class Buku {
    //atribut
    String judul;
    String pengarang;
    int harga;

    //method
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp "+ harga);
    }
}

public class LatihanClassBuku{
    public static void main(String[] args) {
        //deklarasi object buku pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang="Budi Raharjo";
        buku1.harga= 125000;

        //deklarasi object buku kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang="Rinaldi Munir";
        buku2.harga= 150000;

        // Panggil method pada buku 1
        buku1.tampilkanInfo();

        System.out.println();
        // Panggil method pada buku 2
        buku2.tampilkanInfo();
    }
}