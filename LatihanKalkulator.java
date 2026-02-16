public class LatihanKalkulator{
    public static void main(String[] args) {
        //deklarasi variabel yang deskriptif
        int angkaPertama = 25;
        int angkaKedua = 4;
        //output
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1             : " + angkaPertama);
        System.out.println("Angka 2             : " + angkaKedua);
        System.out.println("---");
        //output Penjumlahan
        System.out.println("Penjumlahan         : " + (angkaPertama+angkaKedua));
        //output Pengurangan
        System.out.println("Pengurangan         : " + (angkaPertama-angkaKedua));
        //output Perkalian
        System.out.println("Perkalian           : " + (angkaPertama*angkaKedua));
        //output Pembagian
        System.out.println("Pembagian           : " + (angkaPertama/angkaKedua));
        //output Sisa Bagi
        System.out.println("Sisa Bagi           : " + (angkaPertama%angkaKedua));
        //output Pembagian Desimal
        System.out.println("Pembagian Desimal   : " + ((double) angkaPertama/angkaKedua));
    }
}
