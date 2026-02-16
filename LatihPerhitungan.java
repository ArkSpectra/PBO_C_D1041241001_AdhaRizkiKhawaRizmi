public class LatihPerhitungan{
    public static void main(String[] args) {
        //deklarasi variabel
        int saldo = 1000000;
        int setoran = 500000;
        int penarikan = 250000;
        //output
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal            : " +saldo);
        System.out.println("Setoran               : "+setoran);
        //penambahan saldo, perubahan state saldo menggunakan
        //operasi aritmatika sederhana
        saldo += 500000;
        System.out.println("Saldo Setelah Setor   : " +saldo);
        System.out.println("Penarikan             : " +penarikan);
        //pengurangan saldo, perubahan state saldo menggunakan
        //operasi aritmatika sederhana
        saldo-= 250000;
        System.out.println("Saldo Akhir           : " +saldo);
    }
}
