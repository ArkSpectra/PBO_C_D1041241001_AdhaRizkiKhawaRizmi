public class LatihDataMahasiswa{
    public static void main(String[] args) {
        //deklarasi variabel, dimulai dengan huruf kecil 
        //dan huruf besar untuk huruf pertama pada setiap kata 
        //dimulai dari kata kedua dan seterusnya

        //deklarasi variabel menggunakan long karna int bisa jadi tidak cukup
        long nim = 1041241001L;
        //deklarasi variabel bertipe string
        String nama = "Adha Rizki Khawa Rizmi";
        //deklarasi variabel bertipe char
        char kelas = 'C';
        //deklarasi variabel bertipe boolean, penamaan menggunakan pertanyaan
        boolean isStatusMahasiswaAktif = true;
        //deklarasi variabel bertipe double
        double ipk = 3.97;
        //deklarasi variabel bertipe int
        int sks = 66;
        //output
        System.out.println("=== DATA MAHASISWA ===");
        //penambahan huruf D agar sesuai dengan nim asli
        //tetapi tetap menggunakan long sesuai capaian pembelajaran
        System.out.println("NIM            : D" +nim);
        System.out.println("Nama           : " +nama);
        System.out.println("Kelas          : " +kelas);
        System.out.println("Status Aktif   : " +isStatusMahasiswaAktif);
        System.out.println("IPK Semester   : " +ipk);
        System.out.println("Total SKS      : " +sks);
    }
}
