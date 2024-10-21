package tokoserbaada;
import java.util.Scanner;

public class TokoSerbaAdaMain {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        boolean beliLagi = true;
        
        while (beliLagi) {
            Barang[] daftarBarang = {
                    new Barang("001", "Pulpen", 5000),
                    new Barang("002", "Buku", 10000),
                    new Barang("003", "Pensil", 3000),
                    new Barang("004", "Spidol", 7000),
                    new Barang("005", "Penghapus", 2000)
            };

            System.out.println("TOKO SERBA ADA");
            System.out.println("********************");
            System.out.print("Masukkan Item Barang: ");
            int jumlahItem = masukan.nextInt();

            String[] kodeBarangBeli = new String[jumlahItem];
            int[] jumlahBeli = new int[jumlahItem];

            for (int i = 0; i < jumlahItem; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan Kode: ");
                kodeBarangBeli[i] = masukan.next();
                System.out.print("Masukkan jumlah beli: ");
                jumlahBeli[i] = masukan.nextInt();
            }

            System.out.println("\nTOKO SERBA ADA");
            System.out.println("********************************************");
            System.out.println("No    Kode       Nama Barang     Harga     Jumlah Beli     Jumlah Bayar");
            System.out.println("========================================================================");

            int totalBayar = 0;
            for (int i = 0; i < jumlahItem; i++) {
                for (Barang barang : daftarBarang) {
                    if (barang.getKode().equals(kodeBarangBeli[i])) {
                        int jumlahBayar = barang.getHarga() * jumlahBeli[i];
                        totalBayar += jumlahBayar;
                        System.out.println((i + 1) + "     " + barang.getKode() + "       " + barang.getNama() + "           " + barang.getHarga() + "        " + jumlahBeli[i] + "             " + jumlahBayar);
                        break;
                    }
                }
            }

            System.out.println("========================================================================");
            System.out.println("Total Bayar						: " + totalBayar);
            System.out.println();
            
            String pilihan;
            do {
                System.out.print("Apakah Anda ingin membeli lagi? (Y/N): ");
                pilihan = masukan.next();
                if (pilihan.equalsIgnoreCase("Y") || pilihan.equalsIgnoreCase("y")) {
                    beliLagi = true;
                    break;
                } else if (pilihan.equalsIgnoreCase("N") || pilihan.equalsIgnoreCase("n")) {
                    beliLagi = false;
                    break;
                } else {
                    System.out.println("Pilihan tidak valid, silakan masukkan 'Y' atau 'N'.");
                }
            } while (true);
            
            System.out.println();               
        }  
        
        System.out.println("Terimakasih telah membeli di Toko ini ;3");
        
    }
}
