package tabelperkalian;

public class TabelPerkalian {   
    public void Perkalian (int tabel) {
        System.out.println();
        System.out.println("======================================================================================");
        System.out.println("                          Program Tabel Perkalian " + tabel + " x " + tabel);
        System.out.println("======================================================================================");
        System.out.print("\t");
        for (int kolom = 1; kolom <= tabel; kolom++) {
            System.out.print(kolom + "\t");
        }
        System.out.println();
        
        for (int baris = 1; baris <= tabel; baris++){
            System.out.print(baris + "\t");
            for (int kolom = 1; kolom <= tabel; kolom++) {
                System.out.print(baris * kolom + "\t");
            }
            System.out.println();
        }
        System.out.println("======================================================================================");
    }
}
