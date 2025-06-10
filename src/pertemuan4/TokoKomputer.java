package pertemuan4;


public class TokoKomputer {
    private String namaBarang, tipeGaransi;
    private int stok, harga;
    
    //method constructor
    public TokoKomputer (String namaBarang, String tipeGaransi){
        this.namaBarang = namaBarang;
        this.tipeGaransi = tipeGaransi;
    }
    
    //method mutator
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public void setTipeGaransi(String tipeGaransi) {
        this.tipeGaransi = tipeGaransi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void setTambahStok(int stokTambah) {
        this.stok = stok + stokTambah;
    }
    
    public void setKurangStok(int stokKurang) {
        this.stok = stok - stokKurang;
    }
    
    //method accessor
    public String getNamaBarang(){
        return namaBarang;
    }

    public String getTipeGaransi() {
        return tipeGaransi;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }
    
    //fungsi memanggil nilai
    public void tampilkanNilai(){
        System.out.println("Nama barang: " +getNamaBarang());
        System.out.println("Tipe Garansi: " +getTipeGaransi());
        System.out.println("Stok barang: " +getStok());
        System.out.println("Harga barang: " +getHarga());
    }
    
    
}
