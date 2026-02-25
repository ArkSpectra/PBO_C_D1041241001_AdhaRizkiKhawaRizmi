public class LatihanRefleksi {
    public static void main(String[] args) {
        //Deklarasi
        int angka = 1;
        //output
        System.out.println("=== MENGGUNAKAN WHILE ===");
        //looping while
        while (angka <= 5){
            System.out.print(angka + " ");
            //tambah angka untuk melanjutkan iterasi selanjutnya
            angka++;
        }
        System.out.println();

        //deklarasi ulang
        angka = 1;
        //output
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        //do-while loop
        do { 
            System.out.print(angka + " ");
            //tambah angka untuk melanjutkan iterasi selanjutnya
            angka++;
        } while (angka <= 5); //kondisi
        System.out.println();

        //output
        System.out.println("=== MENGGUNAKAN FOR ===");
        //looping for
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
    }
}