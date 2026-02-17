public class p042OperatorAritmatika{
    public static void main(String[] args) {
        //deklarasikan variabel, tetapi a dan b tidak disarankan
        //karena tidak deskriptif
        int a = 10;
        int b = 3;
        //output a dan b diawal
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        //output penjumlahan a dan b
        System.out.println("a + b = " + (a + b));
        //output pengurangan a dan b
        System.out.println("a - b = " + (a - b));
        //output perkalian a dan b
        System.out.println("a * b = " + (a * b));
        //output pembagian a dan b
        System.out.println("a / b = " + (a / b));
        //output a modulus b
        System.out.println("a % b = " + (a % b));
        //Pembagian dengan desimal, mengubah tipe data saat agar tidak stay di integer 
        double hasil = (double) a / b;
        System.out.println("a / b (desimal) = " + hasil);
    }
}
