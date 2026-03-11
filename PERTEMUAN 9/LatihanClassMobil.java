//deklarasi class
class Mobil {
    //atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    //method untuk menampilkan spesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : "+ tahun);
        System.out.println();
    }
    //method untuk menambah kecepatan mobil
    public void percepat(){
        kecepatan+=20;
        System.out.println("Mobil dipercepat...");

    }
    //method untuk menampilkan kecepatan mobil saat ini
    public void tampilkanKecepatan(){
        
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class LatihanClassMobil{
    public static void main(String[] args) {
        //deklarasi object mobil
        Mobil mobil = new Mobil();
        mobil.merk="Toyota Avanza";
        mobil.warna="Silver";
        mobil.tahun=2020;

        // Panggil method pada mobil untuk menampilkan spesifikasi
        mobil.tampilkanSpesifikasi();
        // Panggil method pada mobil untuk menambah kecepatan mobil
        mobil.percepat();
        mobil.percepat();
        // Panggil method pada mobil untuk menampilkan kecepatan mobil saat ini
        mobil.tampilkanKecepatan();
    }
}