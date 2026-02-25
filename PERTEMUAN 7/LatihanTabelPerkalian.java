public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        //Deklarasi
        int angka = 7;
        //output
        System.out.println("=== TABEL PERKALIAN 7 ===");
        //looping for sebanyak 12 kali
        for (int i = 1; i <= 12; i++){
            int perkalianAngka = angka * i;
            System.out.println("7 x " + i + " = " + perkalianAngka);
        }
    }
}