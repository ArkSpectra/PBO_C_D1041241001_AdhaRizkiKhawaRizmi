public class LatihanValidasi {
    public static void main(String[] args) {
        //deklarasi variabel untuk tahu bahwa yg dicari sudah ditemukan
        boolean found=false;
        //output
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        //outer loop untuk hari
        for (int i=1;i<=3;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.println("Cek: ["+i+","+j+"]");
                if(i==2 && j==3)
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                break;
            }
        }
    }
}