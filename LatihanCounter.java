public class LatihanCounter{
    public static void main(String[] args) {
        //deklarasi
        int counter =10;
        //output
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal        : " + counter);
        counter++;
        counter++;
        //output setelah increment 2 kali
        System.out.println("Setelah ++  (2x)  : " + counter);
        counter--;
        //output setelah decrement 1 kali
        System.out.println("Setelah --        : " + counter);
        counter+=5;
        //output setelah compound assignment operators +5
        System.out.println("Setelah += 5      : " + counter);
        counter-=3;
        //output setelah compound assignment operators -3
        System.out.println("Setelah -= 3      : " + counter);
        counter*=2;
        //output setelah compound assignment operators *2
        System.out.println("Setelah *= 2      : " + counter);
    }
}