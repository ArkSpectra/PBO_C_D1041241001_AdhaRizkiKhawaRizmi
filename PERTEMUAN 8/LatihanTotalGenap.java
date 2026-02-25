public class LatihanTotalGenap {
    public static void main(String[] args) {
        //Deklarasi
        int angka = 7;
        //output
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        //looping for sebanyak 20 kali
        for (int i = 1; i <= 20; i++){
            //pengecekan ganjil
            if(i%2==1)
            {
                //skip angka ganjil dengan continue
                continue;
            }
            //output dengan rumus Sn deret aritmatika
            System.out.println("Tambah: "+i+" → Total: "+(i+2)*i/4);
        }
    }
}