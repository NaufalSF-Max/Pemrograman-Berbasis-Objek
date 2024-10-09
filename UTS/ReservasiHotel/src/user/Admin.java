package user;

import reservasi.Kamar;
import reservasi.Memesan;

public class Admin implements User {
    private String namaAdmin;
    private Kamar kamar1, kamar2, kamar3;
    private Memesan memesan1, memesan2;
    
    public Admin(String namaAdmin, Kamar kamar1, Kamar kamar2, Kamar kamar3, Memesan memesan1, Memesan memesan2) {
        this.namaAdmin = namaAdmin;
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
        this.memesan1 = memesan1;
        this.memesan2 = memesan2;
    }
    
    public void login() {
        System.out.println("Admin " + namaAdmin + " telah berhasil login."); 
    }
    
    public void liatPesanan() {
        System.out.println("Daftar Pesanan:");

        // Tampilkan pesanan 1 jika ada
        if (memesan1 != null) {
            memesan1.tampilPesanan();
        } else {
            System.out.println("Pesanan 1: Belum ada pesanan.");
        }

        // Tampilkan pesanan 2 jika ada
        if (memesan2 != null) {
            memesan2.tampilPesanan();
        } else {
            System.out.println("Pesanan 2: Belum ada pesanan.");
        }
    }
    
    public void tampilKamar() {
        System.out.println(kamar1);
        System.out.println(kamar2);
        System.out.println(kamar3);
    }
}
