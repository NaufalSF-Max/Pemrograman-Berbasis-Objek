package user;

import reservasi.Kamar;
import reservasi.Memesan;

public class Costumer implements User {
    private String namaPelanggan;
    private Kamar kamar1, kamar2, kamar3;
    private Memesan memesan1, memesan2;
    
    public Costumer(String namaPelanggan, Kamar kamar1, Kamar kamar2, Kamar kamar3, Memesan memesan1, Memesan memesan2) {
        this.namaPelanggan = namaPelanggan;
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
        this.memesan1 = memesan1;
        this.memesan2 = memesan2;
    }
    
    public void login() {
        System.out.println("Customer " + namaPelanggan + " telah berhasil login.");
    }
    
    public void liatPesanan() {
        System.out.println("Lihat pesanan untuk " + namaPelanggan + ":");
        if (memesan1 != null) {
            System.out.println(memesan1);
        } if (memesan2 != null) {
            System.out.println(memesan2);
        }
    }
    
    public void pesanKamar(int nomerKamar, String tanggal) {
        if (nomerKamar == kamar1.getNomerKamar() && kamar1.tersedia()) {
            kamar1.setTersedia(false);
            memesan1 = new Memesan(namaPelanggan, kamar1, tanggal);
            System.out.println(" Room " + nomerKamar + " dipesan tanggal " +  tanggal);
        } else if (nomerKamar == kamar2.getNomerKamar() && kamar2.tersedia()) {
            kamar2.setTersedia(false);
            memesan2 = new Memesan(namaPelanggan, kamar2, tanggal);
            System.out.println(" Room " + nomerKamar + " dipesan tanggal " +  tanggal);
        } else if (nomerKamar == kamar3.getNomerKamar() && kamar3.tersedia()) {
            kamar3.setTersedia(false);
            memesan1 = new Memesan(namaPelanggan, kamar3, tanggal);
            System.out.println(" Room " + nomerKamar + " dipesan tanggal " +  tanggal);
        } else {
            System.out.println("Kamar tidak tersedia untuk di pesan.");
        }
    }
    
    public void cekKetersediaan() {
        System.out.printf("%-10s %-15s %-10s%n", "Nomor Kamar", "Tipe Kamar", "Status");
        System.out.println("--------------------------------------------");
        System.out.printf("%-10d %-15s %-10s%n", kamar1.getNomerKamar(), kamar1.getTipeKamar(), kamar1.tersedia()? "Tersedia" : "Tidak Tersedia");
        System.out.printf("%-10d %-15s %-10s%n", kamar2.getNomerKamar(), kamar2.getTipeKamar(), kamar2.tersedia() ? "Tersedia" : "Tidak Tersedia");
        System.out.printf("%-10d %-15s %-10s%n", kamar3.getNomerKamar(), kamar3.getTipeKamar(), kamar3.tersedia() ? "Tersedia" : "Tidak Tersedia");
        System.out.println();
    }
}
