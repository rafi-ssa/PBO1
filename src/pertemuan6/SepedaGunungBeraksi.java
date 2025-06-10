package pertemuan6;


public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sepedaku = new SepedaGunung();
        
        sepedaku.setTambahGir(2);
        System.out.println("Gir: "+sepedaku.getGir());  
        
        sepedaku.setTambahGir(3);
        System.out.println("Gir: "+sepedaku.getGir());  
    }
}
