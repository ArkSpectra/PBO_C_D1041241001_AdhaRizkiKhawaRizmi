public class LatihanValidasi {
    public static void main(String[] args) {
        //deklarasi variabel untuk tahu bahwa yg dicari sudah ditemukan
        boolean found=false;
        //output
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        //outer loop untuk baris
        for (int i=1;i<=3;i++){
            //outer loop untuk kolom
            for(int j=1;j<=5;j++)
            {
                System.out.println("Cek: ["+i+","+j+"]");
                //cek koordinat
                if(i==2 && j==3)
                {
                    //menyatakan bahwa koordinat sudah ditemukan
                    found=true;
                    break;
                }
            }
            //ketika koordinat sudah ditemukan, outer loop juga terkena break
            if(found)
            {
                break;
            }
        }
    }
}