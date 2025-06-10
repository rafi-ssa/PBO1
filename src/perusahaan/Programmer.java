package perusahaan;

public class Programmer extends Karyawan {
    private int jamLembur;

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }
    
    @Override
    public void hitungGaji(){
        gaji = 4000000 + (jamLembur * 20000);
    }
}
