package pertemuan6;

public class Mobil {
    private String warna;
    private int tahunProduksi;
    
    //constructor

    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public Mobil(){
        System.out.println("jalan tanpa parameter");
    }
    
    public void tampilInfo(){
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahunProduksi);
    }
    
    
}


