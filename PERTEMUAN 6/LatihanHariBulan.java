public class LatihanHariBulan {
    public static void main(String[] args) {
        //deklrasi
        int month = 4;
        //ouput
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        //switch untuk range 1-12, dalam konteks ini switch untuk 12 bulan
        switch (month) {
            case 1:
                System.out.println("Bulan: Januari (bulan ke-" + month + ")" );
                break;
            case 2:
                System.out.println("Bulan: Februari (bulan ke-" + month + ")" );
                break;
            case 3:
                System.out.println("Bulan: Maret (bulan ke-" + month + ")" );
                break;
            case 4:
                System.out.println("Bulan: April (bulan ke-" + month + ")" );
                break;
            case 5:
                System.out.println("Bulan: Mei (bulan ke-" + month + ")" );
                break;
            case 6:
                System.out.println("Bulan: Juni bulan ke-" + month + ")" );
                break;
            case 7:
                System.out.println("Bulan: Juli (bulan ke-" + month + ")" );
                break;
            case 8:
                System.out.println("Bulan: Agustus (bulan ke-" + month + ")" );
                break;
            case 9: 
                System.out.println("Bulan: September (bulan ke-" + month + ")" );
                break;              
            case 10:
                System.out.println("Bulan: Oktober (bulan ke-" + month + ")" );
                break;
            case 11:
                System.out.println("Bulan: November (bulan ke-" + month + ")" );
                break;
            case 12:
                System.out.println("Bulan: Desember (bulan ke-" + month + ")" );
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
        //fall through Switch untuk hari dalam bulan
        switch (month) {
            //Intentional fall through untuk bulan dengan 31 hari 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah Hari : 31");
                break;
            //Intentional fall through untuk bulan dengan 30 hari
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah Hari : " + 30);
                break;
            //Intentional fall through untuk bulan dengan 28 hari
            case 2:
                System.out.println("Jumlah Hari : " + 28);
                break;
            //default case jika seluruh case tidak terjadi
            default:
                System.out.println("Error : Bulan tidak valid");
                break;
        }
    }
}