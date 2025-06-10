package pertemuan9;


public class Mahasiswa {
    //variabel diluar adalah instance variabel
    private int usia;
    //class variabel
    private static final String univ = "uniska";
    
    public void sebutNama(String nama, String kelas){
        String prodi = "Teknik Informatika"; //local variabel
        System.out.println("Program Studi "+ prodi);
        System.out.println("Nama "+nama);
        System.out.println("Kelas "+kelas);
        System.out.println("Perguruan tinggi" + univ);
    }
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.usia = 21;
        mhs2.usia = 20;
        
        
        mhs1.sebutNama("rapi","4c");
        mhs2.sebutNama("rafi","4c");
        
        System.out.println("usia "+mhs1.usia);
    }
}
