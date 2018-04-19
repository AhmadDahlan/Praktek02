package praktek02;
public class Baju {
    String merk;
    double jumlah;
    double harga;

    public Baju() {
        jumlah=3;
        harga=50000;
    }

    public Baju(double jumlah, double harga) {
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    void pelindungtubuh(){
        System.out.println("==================");
        System.out.println("merk : "+merk);
        System.out.println("jumlah : "+jumlah);
        System.out.println("harga : "+harga);
        System.out.println("==================");
    }
    
    double hitungHasil(){
        double hasil;
        hasil=jumlah*harga;
        return hasil;
                }
    
    void cetakHasil(){
        System.out.println("Hasilnya adalah: "+hitungHasil());
    }
}
