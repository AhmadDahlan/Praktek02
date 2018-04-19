package praktek02;

public class BajuAksi {
    public static void main(String[] args) {
        Baju b1 = new Baju();
        b1.merk = "Nevada";
        b1.jumlah = 5;
        b1.harga = 50000;
        
        b1.pelindungtubuh();
        System.out.println("Hasil baju = "+b1.hitungHasil() );
        b1.cetakHasil();
        
        Baju b2 = new Baju();
        b2.pelindungtubuh();
        
        Baju b3 = new Baju(50,40);
        b3.pelindungtubuh();
    }
    
}
