package pertemuan3;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepedaRafi = new Sepeda();
    
        sepedaRafi.setGir(1);
        
        System.out.println("Gir ku saat ini: "+sepedaRafi.getGir());
        
        sepedaRafi.setNaikGir(3);
        
        System.out.println("Gir ku saat ini "+sepedaRafi.getGir());
        
        sepedaRafi.setTurunGir(2);
        
        System.out.println("Gir ku saat ini "+sepedaRafi.getGir());
    }
 
}
