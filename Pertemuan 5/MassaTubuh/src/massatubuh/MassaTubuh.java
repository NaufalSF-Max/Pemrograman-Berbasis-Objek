package massatubuh;
import java.util.Scanner;

public class MassaTubuh {
    public static void main(String[] args) {
        String kriteria;
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan anda (kg)    : "); double beratBadan = masukan.nextDouble();
        System.out.print("Masukkan Tinggi Badan anda (m)    : "); double tinggiBadan = masukan.nextDouble();
        
        double indeksMassaTubuh = beratBadan / (tinggiBadan * tinggiBadan);
        
        if (indeksMassaTubuh >= 40) {
            kriteria = "SangatGemuk";
        } else if (indeksMassaTubuh >= 30 && indeksMassaTubuh <= 39.9) {
            kriteria = "Gemuk";
        } else if (indeksMassaTubuh >= 25 && indeksMassaTubuh <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (indeksMassaTubuh >= 18.5 && indeksMassaTubuh <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else {
            kriteria = "Berat Badan Kurang";
        }
        
        System.out.println("Indeks Massa Tubuh anda           : " + indeksMassaTubuh);
        System.out.println("Kriteria                          : " + kriteria);
    }
}
