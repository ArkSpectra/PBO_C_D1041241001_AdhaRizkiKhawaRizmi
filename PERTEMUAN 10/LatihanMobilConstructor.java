//deklarasi class
class Mobil {
    //atribut
    String merk;
    String warna;
    int tahun;
    
    //Constructor Tanpa parameter
    public Mobil(){
        merk = "Belum diisi";
        warna =  "Belum diisi";
        tahun = 0;
    }
    //Constructor 1 parameter
    public Mobil(String merk){
        this.merk = merk;
        warna =  "Belum diisi";
        tahun = 0;
    }
    //Constructor 3 parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna =  warna;
        this.tahun = tahun;
    }
    //method untuk menampilkan spesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : "+ tahun);
        System.out.println();
    }
}

public class LatihanMobilConstructor{
    public static void main(String[] args) {
        //deklarasi object mobil pertama dengan constructor default
        Mobil mobil1 = new Mobil();
        //deklarasi object mobil kedua dengan 1 parameter
        Mobil mobil2 = new Mobil("Toyota");
        //deklarasi object mobil ketiga dengan 3 parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);


        // Panggil method pada mobil 1 untuk menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();
        // Panggil method pada mobil 2 untuk menampilkan spesifikasi
        mobil2.tampilkanSpesifikasi();
        // Panggil method pada mobil 3 untuk menampilkan spesifikasi
        mobil3.tampilkanSpesifikasi();
    }
}