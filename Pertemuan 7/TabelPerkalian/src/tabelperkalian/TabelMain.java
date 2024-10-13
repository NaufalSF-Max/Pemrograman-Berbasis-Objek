package tabelperkalian;
import java.util.Scanner;

public class TabelMain {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        char lanjut;
        
        do {
            System.out.println("======================================================================================");
            System.out.println("                          Program Tabel Perkalian n x n                               ");
            System.out.println("======================================================================================");
            System.out.print("Masukkan nilai n (1 - 10): "); int tabel = masukan.nextInt();

            if (tabel < 1 || tabel > 10) {
                System.out.println("Nilai n hanya boleh 1 - 10");
            } else {
                TabelPerkalian tabelPerkalian = new TabelPerkalian();
                tabelPerkalian.Perkalian(tabel);
            }
            System.out.print("Apakah anda ingin mencoba dengan nilai n yang lain? (Y/N): ");
            lanjut = masukan.next().charAt(0);
            System.out.println();
        } while (lanjut == 'y' || lanjut == 'Y');
        
        System.out.println("Terimakasih telah mencoba program ini ;3");
    }
}
