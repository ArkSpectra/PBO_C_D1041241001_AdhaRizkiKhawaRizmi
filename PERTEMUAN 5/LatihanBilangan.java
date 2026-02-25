public class LatihanBilangan {
    public static void main(String[] args) {
        //deklarasi variabel
        int number = -7; //value dapat diganti menjadi -7

        //output
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        //pengecekan positif
        if(number>=0)
        {
            System.out.println("Jenis: Bilangan positif");
            //pengecekan genap
            if(number%2==0)
            {
                System.out.println("Tipe: Genap");
            }
            //ketika bukan genap, maka ganjil
            else{
                
                System.out.println("Tipe: Ganjil");
            }

        }
        //pengecekan negatif
        else if (number<=0){
            
            System.out.println("Jenis: Bilangan negatif");
            //pengecekan genap
            if(number%2==0)
            {
                System.out.println("Tipe: Genap");
            }
            //ketika bukan genap, maka ganjil
            else{
                
                System.out.println("Tipe: Ganjil");
            }
        }
        //ketika semua kondisi tidak berjalan, berarti angka adalah 0
        else{
            System.out.println("Jenis: Bilangan nol");
        }
    }
}