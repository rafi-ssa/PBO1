package pertemuan4;


public class TokoKomputerBeraksi {
    public static void main(String[] args) {
        //objek
        TokoKomputer laptop1 = new TokoKomputer("Asus Aspire 3", "Garansi Toko");
        TokoKomputer laptop2 = new TokoKomputer("Asus Aspire 5", "Garansi Pabrik");
        
        //atrbut
        laptop1.setHarga(3000000);
        laptop1.setTambahStok(5);
        
        laptop2.setHarga(4000000);
        laptop2.setTambahStok(5);
        
        laptop1.setKurangStok(2);
        laptop2.setKurangStok(1);
        
        System.out.println("TOKO KOMPUTER");
        laptop1.tampilkanNilai();
        System.out.println("----------------");
        laptop2.tampilkanNilai();
        
    }
}
