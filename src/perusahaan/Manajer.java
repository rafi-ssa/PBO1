
package perusahaan;

public class Manajer extends Karyawan{
    private double tunjangan;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void hitungGaji(){
        gaji = 5000000 + tunjangan;
    }
}
