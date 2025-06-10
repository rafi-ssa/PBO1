package perusahaan;

public class PerusahaanBeraksi {
    public static void main(String[] args) {
        Karyawan Hengky = new Manajer();
        Hengky.setNama("Hengky De Jong");
        Hengky.setJabatan("Manajer");
        
        ((Manajer)Hengky).setTunjangan(1500000);
        Hengky.hitungGaji();
        Hengky.tampilInfo();
        System.out.println("--------------------------");
    
        Karyawan Raffi = new Programmer();
        Raffi.setNama("Muhammad Hendryan Raffi");
        Raffi.setJabatan("Programmer");
        
        ((Programmer)Raffi).setJamLembur(50);
        Raffi.hitungGaji();
        Raffi.tampilInfo();
    }
}
