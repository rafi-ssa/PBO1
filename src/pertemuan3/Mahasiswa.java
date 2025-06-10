package pertemuan3;

public class Mahasiswa {
    //atribut
    String nama, npm;
    int umur;
    
    
    //method constructor
    public Mahasiswa(String nama, String npm,int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    public void info(){
        System.out.println("Nama: "+nama);
        System.out.println("Npm: "+npm);
        System.out.println("Umur: "+umur);
    }
}
