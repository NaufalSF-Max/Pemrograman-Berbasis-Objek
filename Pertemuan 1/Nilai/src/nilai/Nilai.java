package nilai;

public class Nilai {
    String nim, nama;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    double nilaiAkhir () {
        nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        return nilaiAkhir;
    }
    
    void Nilai() {
        nim = "xxxxxxx";
        nama = "xxxxxxx";
        nilaiAbsen = 00000;
        nilaiTugas = 00000;
        nilaiUTS = 00000;
        nilaiUAS = 00000;
        nilaiAkhir = 00000;
    }
    
    // Method to print data
    void CetakNilai() {
        System.out.println("NIM               : " + this.nim);
        System.out.println("Nama              : " + this.nama);
        System.out.println("Nilai Absen [10%] : " + this.nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + this.nilaiTugas);
        System.out.println("Nilai UTS [30%]   : " + this.nilaiUTS);
        System.out.println("Nilai UAS [40%]   : " + this.nilaiUAS);
        System.out.println("Nilai Akhir       : " + this.nilaiAkhir);
        System.out.println();
    }
}
