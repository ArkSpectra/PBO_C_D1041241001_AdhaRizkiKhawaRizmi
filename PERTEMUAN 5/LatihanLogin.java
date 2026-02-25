public class LatihanLogin {
    public static void main(String[] args) {
        //deklarasi 
        String inputUsername = "admin"; 
        String inputPassword = "admin123"; //value dapat diganti menjadi "adha123"
        //output
        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");
        //pengecekan username
        if (inputUsername.equals("admin")){
            System.out.println("Username valid");
            //pengecekan password
            if (inputPassword.equals("admin123")){
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            } 
            //ketika kondisi salah, maka password salah
            else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
        //ketika kondisi salah, maka username salah 
        else {
            System.out.println("Username tidak valid");
            System.out.println("LOGIN GAGAL!");
        }
    }
}