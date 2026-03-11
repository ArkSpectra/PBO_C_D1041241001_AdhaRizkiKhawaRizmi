//deklarasi class
class Persegi {
    //atribut
    int sisi;
    int luas;
    int keliling;

    //Constructor 1 parameter dengan validasi input
    public Persegi(int sisi){
        if(sisi<=0){
            this.sisi = 1;
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
        }
        else{
            this.sisi = sisi;
        }
        this.luas = this.sisi*this.sisi;
        this.keliling = 4*this.sisi;
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

public class LatihanPersegiConstructor{
    public static void main(String[] args) {
        //deklarasi object persegi pertama dengan disi yang valid
        Persegi persegi1 = new Persegi(5);
        //Panggil method pada persegi 1 untuk menampilkan hasil
        persegi1.tampilkanHasil();

        //deklarasi object persegi pertama dengan sisi yang invalid
        Persegi persegi2 = new Persegi(-3);
        //Panggil method pada persegi 2 untuk menampilkan hasil
        persegi2.tampilkanHasil();
    }
}