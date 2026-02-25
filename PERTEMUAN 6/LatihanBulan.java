public class LatihanBulan {
    public static void main(String[] args) {
        //deklarasi
        int month = 5; //value bisa diganti jadi 13
        //ouput
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);
        //switch untuk range 1-12, dalam konteks ini switch untuk 12 bulan
        switch (month){
            case 1:
                System.out.println("Nama Bulan: Januari");
                break;
            case 2:
                System.out.println("Nama Bulan: Februari");
                break;
            case 3:
                System.out.println("Nama Bulan: Maret");
                break;
            case 4:
                System.out.println("Nama Bulan: April");
                break;
            case 5:
                System.out.println("Nama Bulan: Mei");
                break;
            case 6:
                System.out.println("Nama Bulan: Juni");
                break;
            case 7:
                System.out.println("Nama Bulan: Juli");
                break;
            case 8:
                System.out.println("Nama Bulan: Agustus");
                break;
            case 9:
                System.out.println("Nama Bulan: September");
                break;
            case 10:
                System.out.println("Nama Bulan: Oktober");
                break;
            case 11:
                System.out.println("Nama Bulan: November");
                break;
            case 12:
                System.out.println("Nama Bulan: Desember");
                break;
            //default case jika seluruh case tidak terjadi
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }
}