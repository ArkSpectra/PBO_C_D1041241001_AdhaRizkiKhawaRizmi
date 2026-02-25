public class LatihanMenuHarian {
    public static void main(String[] args) {
        //output
        System.out.println("=== MENU MAKAN 3 HARI ===");
        //outer loop untuk hari
        for (int i=1;i<=3;i++)
        {
            System.out.println("Hari " +i+":");
            //pengecekan hari pertama
            if(i==1)
            {
                //inner loop untuk waktu makan
                for(int j=1;j<=2;j++)
                {
                    //pengecekan pagi
                    if(j==1)
                    {
                        System.out.println("Pagi: Nasi Goreng");
                    }
                    //pengecekan siang
                    else
                    {
                        System.out.println("Siang: Soto Ayam");
                    }

                }
            }
            //pengecekan hari kedua
            if(i==2)
            {
                //inner loop untuk waktu makan
                for(int j=1;j<=2;j++)
                {
                    //pengecekan pagi
                    if(j==1)
                    {
                        System.out.println("Pagi: Bubur Ayam");
                    }
                    //pengecekan siang
                    else
                    {
                        System.out.println("Siang: Mie Goreng");
                    }

                }
            }
            //pengecekan hari ketiga
            if(i==3)
            {
                //inner loop untuk waktu makan
                for(int j=1;j<=2;j++)
                {
                    //pengecekan pagi
                    if(j==1)
                    {
                        System.out.println("Pagi: Roti Bakar");
                    }
                    //pengecekan siang
                    else
                    {
                        System.out.println("Siang: Nasi Uduk");
                    }

                }
            }
            
            System.out.println("");
        }
    }
}