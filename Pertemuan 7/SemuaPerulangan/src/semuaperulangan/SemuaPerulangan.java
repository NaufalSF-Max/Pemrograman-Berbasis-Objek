package semuaperulangan;
import java.util.Scanner;

public class SemuaPerulangan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        BilanganPrima Prima = new BilanganPrima();
        BilanganGanjilGenap GanjilGenap = new BilanganGanjilGenap();
        HurufZA ZA = new HurufZA();
        AnakAyam Lagu = new AnakAyam();
        boolean loop = true;
        
        while(loop) {
            System.out.println("=================================================");
            System.out.println("                Menu Perulangan                  ");
            System.out.println("=================================================");
            System.out.println(" 1. Hitung Deret Bilangan Prima 0 - 20");
            System.out.println(" 2. Hitung Deret Bilangan Ganjil Genap 0 - 20");
            System.out.println(" 3. Huruf Z - A");
            System.out.println(" 4. Lagu Anak Ayam Turun N");
            System.out.println(" 0. Keluar Menu");
            System.out.println("=================================================");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = masukan.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    Prima.Prima();
                    System.out.println();
                    break;
                case 2:
                    GanjilGenap.GanjilGenap();
                    System.out.println();                    
                    break;
                case 3:
                    ZA.ZA();
                    System.out.println();                    
                    break;
                case 4:
                    Lagu.laguAnakAyam();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan program ini :3");
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }    
    }
}
