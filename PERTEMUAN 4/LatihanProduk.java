public class LatihanProduk{
    // Konstanta dideklarasika di level class dengan huruf kapital
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //deklarasi variabel 
        String namaProduk="Laptop Asus";
        int harga=7000000;
        int stok=15;
        boolean isStockReady = true;
        //output
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + namaProduk);
        System.out.println("Harga Satuan        : Rp " + harga);
        System.out.println("Jumlah Stok         : " + stok);
        System.out.println("Status Tersedia     : " + isStockReady);
        System.out.println("---");
        //output dengan kalkulasi perkalian harga dan stok
        System.out.println("Total Nilai Stok    : Rp " + harga*stok);
        //output untuk pajak keseluruhan dengan perubahan tipe data menjadi int
        System.out.println("Pajak (11%)         : Rp " + (int) ((harga*stok)*PAJAK));
    }
}
