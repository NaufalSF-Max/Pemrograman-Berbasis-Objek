package inputnilaimahasiswa;
import java.util.Scanner;

public class InputNilaiMahasiswa {
    public static void main(String[] args) {
        char grade;
        String keterangan;
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("NPM               : "); String npm = masukan.nextLine();
        System.out.print("Nama Mahasiswa    : "); String namaMahasiswa = masukan.nextLine();
        System.out.print("Nilai Kehadiran   : "); double nilaiKehadiran = masukan.nextDouble();
        System.out.print("Nilai Tugas       : "); double nilaiTugas = masukan.nextDouble();
        System.out.print("Nilai UTS         : "); double nilaiUTS = masukan.nextDouble();
        System.out.print("Nilai UAS         : "); double nilaiUAS = masukan.nextDouble();
        
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = 'A';
            keterangan = "Istimewa";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = 'D';
            keterangan = "Kurang";
        } else {
            grade = 'E';
            keterangan = "Kurang Sekali";
        }
        
        System.out.println("\nData Mahasiswa");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}
