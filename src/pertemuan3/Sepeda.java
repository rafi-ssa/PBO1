package pertemuan3;

public class Sepeda {
    int gir;
    //method mutator
    void setGir(int pertambahanGir){
        this.gir = gir + pertambahanGir;
    }
    void setNaikGir(int naikGir){
        gir = gir + naikGir;
    }
    void setTurunGir(int turunGir){
        gir = gir - turunGir;
    }
    
    //method accessor
    int getGir(){
        return gir;
    }
}
