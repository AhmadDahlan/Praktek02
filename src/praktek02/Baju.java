package praktek02;
public class Baju {
    String merk;
    double jumlah;
    double harga;
    
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
