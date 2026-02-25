public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Deklarasi
        int angka = 1;
        //ouput
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        //looping while selama angka kurang dari atau sama dengan 15
        while (angka <= 15){
            System.out.print(angka + " ");
            //tambahkan angka sebanyak 2 sehingga hanya menampilkan angka ganjil
            angka += 2;
        }
    }
}