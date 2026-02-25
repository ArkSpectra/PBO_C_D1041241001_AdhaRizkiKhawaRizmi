public class LatihanDiskon {
    public static void main(String[] args) {
        //deklarasi variabel
        double totalBelanja = 750000;
        //output
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        //pengecekan jika total belanja lebih dari 1 juta
        if (totalBelanja >= 1000000){
            System.out.println("Diskon (15%): Rp " + totalBelanja * 0.15);
            System.out.println("Harga Akhir: Rp " + totalBelanja * 0.85);
            System.out.println("Anda hemat: Rp " + totalBelanja * 0.15);
        } 
        //pengecekan jika total belanja lebih dari 500 ribu
        //tidak perlu dicek jika kurang dari 1 juta, karna dititik ini sudah dipastikan >=1 juta itu salah
        else if (totalBelanja >= 500000){
            //jika total belanja lebih dari lebih dari 500rb dan kurang dari 1jt diskon 10%
            System.out.println("Diskon (10%): Rp " + totalBelanja * 0.1);
            System.out.println("Harga Akhir: Rp " + totalBelanja * 0.9);
            System.out.println("Anda hemat: Rp " + totalBelanja * 0.1);
        } 
        //pengecekan jika total belanja lebih dari 100 ribu
        //tidak perlu dicek jika kurang dari 500 ribu, karna dititik ini sudah dipastikan >=500 ribu itu salah
        else if (totalBelanja >= 100000){
            //jika total belanja lebih dari lebih dari 100rb dan kurang dari 500rb diskon 10%
            System.out.println("Diskon (10%): Rp " + totalBelanja * 0.05);
            System.out.println("Harga Akhir: Rp " + totalBelanja * 0.95);
            System.out.println("Anda hemat: Rp " + totalBelanja * 0.05);
        } 
        //ketika semua kondisi salah, sudah dipastikan total belanja dibawah 100 ribu
        else {
            //jika total belanja lebih dari kurang dari 100rb Tidak diskon
            System.out.println("Diskon (0%): Rp " + 0);
            System.out.println("Harga Akhir: Rp " + totalBelanja);
            System.out.println("Anda hemat: Rp " + 0);
        }
    }
}