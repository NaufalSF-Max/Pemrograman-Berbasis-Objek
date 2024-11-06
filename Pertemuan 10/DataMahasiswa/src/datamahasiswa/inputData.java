package datamahasiswa;
import java.util.ArrayList;

public class inputData {
    ArrayList<DataMahasiswa>nilaiMahasiswa;
    
    public inputData(){
        nilaiMahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String mataKuliah, String nilaiAkhir){
        DataMahasiswa mhs = new DataMahasiswa(nim, nama, alamat, mataKuliah, nilaiAkhir);
        nilaiMahasiswa.add(mhs);
    }
    
    public ArrayList<DataMahasiswa>getALL(){
        return nilaiMahasiswa;
    }
    
    public void deleteData(int index){
        nilaiMahasiswa.remove(index);
    }
}
