//deklarasi class
class Persegi {
    //atribut
    int sisi;
    int luas;
    int keliling;

    //method untuk menghitung luas
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    //method untuk menghitung keliling
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
    //method untuk menampilkan hasil
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi +  " cm");
        System.out.println("Luas     : " + luas+" cm²");
        System.out.println("Keliling : "+ keliling+" cm");
        System.out.println();
    }
}

public class LatihanClassPersegi{
    public static void main(String[] args) {
    //Object persegi
    Persegi persegi = new Persegi();
    persegi.sisi=5;
    //panggil method pada persegi untuk menghitung luas
    persegi.hitungLuas();
    //panggil method untuk menghitung keliling
    persegi.hitungKeliling();
    //panggil method untuk menampilkan hasil
    persegi.tampilkanHasil();
    }
}