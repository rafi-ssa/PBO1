package pertemuan2;

public class BukaBuku {
    public static void main(String[] args){
        // membuat objek
        Buku bukuBahasaIndonesia = new Buku();
        Buku bukuBahasaInggris = new Buku();
        
        // mengisi atribut bukuBahasaIndonesia
        bukuBahasaIndonesia.judul = "Bahasa Indonesia";
        bukuBahasaIndonesia.penerbit = "Muhammad";
        bukuBahasaIndonesia.tahunTerbit = 2024;
        
        // mengisi atribut bukuBahasaInggris
        bukuBahasaInggris.judul = "Bahasa Inggris";
        bukuBahasaInggris.penerbit = "Hendryan";
        bukuBahasaInggris.tahunTerbit = 2025;
        
        //menampilkan nilainya
        System.out.println("Judul : "+bukuBahasaIndonesia.judul);
        System.out.println("Penerbit : "+bukuBahasaIndonesia.penerbit);
        System.out.println("Tahun Terbit : "+bukuBahasaIndonesia.tahunTerbit);
        System.out.println("------------------------------------------------");
        System.out.println("Judul : "+bukuBahasaInggris.judul);
        System.out.println("Penerbit : "+bukuBahasaInggris.penerbit);
        System.out.println("Tahun Terbit : "+bukuBahasaInggris.tahunTerbit);
        
    }
    
}
