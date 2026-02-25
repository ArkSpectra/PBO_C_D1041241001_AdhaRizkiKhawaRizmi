public class LatihanValidasi {
    public static void main(String[] args) {
        //Deklarasi
        int nilai = 0;
        int iterasi = 1;
        //output
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println();
        //do-while loop untuk terus mengulangi hingga nilai ujian valid (berada dalam 0-100)
        do {
            //Simulasi input 3x
            if (iterasi == 1) {
                nilai = -10;
            } else if (iterasi == 2) {
                nilai = 150;
            } else {
                nilai = 85;
            } 
            System.out.println("Percobaan input: " + nilai);
            //pengecekan apakah nilai valid
            if (nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            }
            //iterasi bertambah 1
            iterasi++;
        } while (nilai < 0 || nilai > 100);
        System.out.println("✓ Nilai valid: " + nilai);
    }
}