package perusahaan;

public class Karyawan {
    private String nama, jabatan;
    protected double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }
    
    public void hitungGaji() {
        gaji = 3000000;
    }
    
    public void tampilInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : " + gaji);
    }
    
}
