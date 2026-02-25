public class LatihanCariKelipatan {
    public static void main(String[] args) {
        //output
        System.out.println("=== CARI KELIPATAN 7 ===");
        //looping for sebanyak 50 kali
        for (int i = 1; i <= 50; i++){
            System.out.println("cek: "+i);
            //pengecekan apakah kelipatan 7 atau tidak
            if(i%7==0)
            {
                System.out.println("✓ Kelipatan 7 pertama: "+i);
                System.out.println("Pencarian selesai.");
                //break untuk menghentikan program
                break;
            }
        }
    }
}