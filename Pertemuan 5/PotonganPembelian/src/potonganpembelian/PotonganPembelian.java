package potonganpembelian;
import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        double potongan;
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Total Pembelian                 :Rp. "); double totalPembelian = masukan.nextDouble();
        
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.2;
        }
        
        double jumlahBayar = totalPembelian - potongan;
        
        System.out.println("Besarnya potongan               :Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayakan     :Rp. " + jumlahBayar);
    }
}
