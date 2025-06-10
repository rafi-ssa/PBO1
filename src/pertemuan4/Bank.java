package pertemuan4;

public class Bank {
    private String nama, noRek;
    private int saldo;
    
    public Bank (String nama, String noRek){
        this.nama = nama;
        this.noRek = noRek;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getNoRek() {
        return noRek;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void panggilSout(){
        System.out.println("Nama: "+nama);
        System.out.println("No Rekening: "+noRek);
        System.out.println("Saldo anda: "+saldo);
    }
}
