package nilai;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        Nilai mhs1 = new Nilai ();
        Nilai mhs2 = new Nilai ();
        
        nilai.Nilai();
        nilai.CetakNilai();
        
        mhs1.nim = "2310631170108";
        mhs1.nama = "Naufal Syafiq ";
        mhs1.nilaiAbsen = 100;
        mhs1.nilaiTugas = 75;
        mhs1.nilaiUTS = 80;
        mhs1.nilaiUAS = 85;
        mhs1.nilaiAkhir();
        mhs1.CetakNilai();
        
        mhs1.nim = "2310631170084";
        mhs1.nama = "Ferdy Yansah";
        mhs1.nilaiAbsen = 90;
        mhs1.nilaiTugas = 85;
        mhs1.nilaiUTS = 70;
        mhs1.nilaiUAS = 70;
        mhs1.nilaiAkhir();
        mhs1.CetakNilai();
    }
}
