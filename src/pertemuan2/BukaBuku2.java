package pertemuan2;


public class BukaBuku2 {
    public static void main(String[] args){
        // membuat objek
        Buku2 bukuBahasaIndonesia = new Buku2();
        Buku2 bukuBahasaInggris = new Buku2();
        
        // mengisi atribut bukuBahasaIndonesia
        bukuBahasaIndonesia.judul = "Bahasa Indonesia";
        bukuBahasaIndonesia.penerbit = "Muhammad";
        bukuBahasaIndonesia.tahunTerbit = 2024;
        
        // mengisi atribut bukuBahasaInggris
        bukuBahasaInggris.judul = "Bahasa Inggris";
        bukuBahasaInggris.penerbit = "Hendryan";
        bukuBahasaInggris.tahunTerbit = 2025;
        
        //menampilkan nilainya
//        System.out.println("Judul : "+bukuBahasaIndonesia.judul);
//        System.out.println("Penerbit : "+bukuBahasaIndonesia.penerbit);
//        System.out.println("Tahun Terbit : "+bukuBahasaIndonesia.tahunTerbit);
        bukuBahasaIndonesia.printInfo();

        System.out.println("------------------------------------------------");
//        System.out.println("Judul : "+bukuBahasaInggris.judul);
//        System.out.println("Penerbit : "+bukuBahasaInggris.penerbit);
//        System.out.println("Tahun Terbit : "+bukuBahasaInggris.tahunTerbit);
        bukuBahasaInggris.printInfo();
        
    }
}
