package datamahasiswa;
public class DataMahasiswa {
    private String nim, nama, alamat, mataKuliah, nilaiAkhir;

    public DataMahasiswa(String NIM, String nama, String alamat, String mataKuliah, String nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getNIM() {
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }

    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public String getNilaiAkhir(){
        return nilaiAkhir;
    }
}
