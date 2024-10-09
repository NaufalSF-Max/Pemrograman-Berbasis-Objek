package reservasi;
public class Kamar {
    private int nomerKamar;
    private String tipeKamar;
    private boolean tersedia;
    
    public Kamar (int nomerKamar, String tipeKamar, boolean tersedia) {
        this.nomerKamar = nomerKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = tersedia;
    }
    
    public int getNomerKamar() {
        return nomerKamar;
    }
    
    public String getTipeKamar() {
        return tipeKamar;
    }
    
    public boolean tersedia() {
        return tersedia;
    }
    
    public void setTersedia(boolean sedangTersedia) {
        tersedia = sedangTersedia;
    }
    
    public String toString() {
        return "Room " + nomerKamar + " [" + tipeKamar + "] - " + (tersedia ? "Sedang Tersedia" : "Sudah Dipesan");
    }
 
}
