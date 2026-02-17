public class p041NamingConvention{
    // Konstanta dideklarasika di level class dengan huruf kapital
    public static final double PI =3.14;
    public static void main(String[] args) {
        //deklarasi variabel, dimulai dengan huruf kecil 
        //dan huruf besar untuk huruf pertama pada setiap kata 
        //dimulai dari kata kedua dan seterusnya
        int studentAge = 20;
        String studentName = "Budi";
        boolean isActive = true;

        //output
        System.out.println("Nama: " + studentName);
        System.out.println("Umur: " + studentAge);
        System.out.println("Status: " + isActive);
        System.out.println("Konstanta PI: " + PI);
    }
}
