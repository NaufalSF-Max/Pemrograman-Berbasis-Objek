package reservasi;

import user.Admin;
import user.Costumer;
import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Kamar kamar1 = new Kamar(101, "Single", true);
        Kamar kamar2 = new Kamar(102, "Double", true);
        Kamar kamar3 = new Kamar(103, "Suite", true);

        Memesan memesan1 = null;
        Memesan memesan2 = null;

        Admin admin = new Admin("Naufal", kamar1, kamar2, kamar3, memesan1, memesan2);
        Costumer customer = new Costumer("Syafiq", kamar1, kamar2, kamar3, memesan1, memesan2);

        Scanner masukan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("|   Selamat datang di sistem reservasi hotel!   |");
        System.out.println("=====================================");
        System.out.printf("%-5s %-20s %n", "No", "User");
        System.out.println("-----------------------------");
        System.out.printf("%-5s %-20s %n", "1", "Admin");
        System.out.printf("%-5s %-20s %n", "2", "Customer");
        System.out.println("-----------------------------");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = masukan.nextInt();
        
        switch (pilihan) {
            case 1:
                admin.login();
                System.out.println();
                System.out.println("=====================================");
                System.out.printf("%-5s %-20s %n", "No", "Opsi Admin");
                System.out.println("-----------------------------");
                System.out.printf("%-5s %-20s %n", "1", "Lihat kamar");
                System.out.printf("%-5s %-20s %n", "2", "Lihat booking");
                System.out.println("-----------------------------");

                System.out.print("Pilih opsi Admin: ");
                int pilihanAdmin = masukan.nextInt();
                if (pilihanAdmin == 1) {
                    admin.tampilKamar();
                } else if (pilihanAdmin == 2) {
                    admin.liatPesanan();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 2:
                customer.login();

                System.out.println("=====================================");
                System.out.printf("%-5s %-20s %n", "No", "Opsi Customer");
                System.out.println("-----------------------------");
                System.out.printf("%-5s %-20s %n", "1", "Cek ketersediaan kamar");
                System.out.printf("%-5s %-20s %n", "2", "Pesan kamar");
                System.out.printf("%-5s %-20s %n", "3", "Lihat booking");
                System.out.println("-----------------------------");

                System.out.print("Pilih opsi Customer: ");
                int pilihanPelanggan = masukan.nextInt();

                if (pilihanPelanggan == 1) {
                    customer.cekKetersediaan();
                } else if (pilihanPelanggan == 2) {
                    System.out.println("========================================");
                    System.out.println("|         Kamar yang Tersedia          |");
                    System.out.println("========================================");
                    System.out.printf("%-10s %-15s %-10s%n", "Nomor Kamar", "Tipe Kamar", "Status");
                    System.out.println("----------------------------------------");

                    if (kamar1.tersedia()) {
                        System.out.printf("%-10d %-15s %-10s%n", kamar1.getNomerKamar(), kamar1.getTipeKamar(), "Tersedia");
                    }
                    if (kamar2.tersedia()) {
                        System.out.printf("%-10d %-15s %-10s%n", kamar2.getNomerKamar(), kamar2.getTipeKamar(), "Tersedia");
                    }
                    if (kamar3.tersedia()) {
                        System.out.printf("%-10d %-15s %-10s%n", kamar3.getNomerKamar(), kamar3.getTipeKamar(), "Tersedia");
                    }

                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomerKamar = masukan.nextInt();
                    
                    System.out.println("Masukkan tanggal booking (YYYY-MM-DD): ");
                    String tanggal = masukan.next();
                    
                    customer.pesanKamar(nomerKamar, tanggal);
                } else if (pilihanPelanggan == 3) {
                    customer.liatPesanan();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        System.out.println("=====================================");
        System.out.println("|   Selamat datang di sistem reservasi hotel!   |");
        System.out.println("=====================================");
        System.out.printf("%-5s %-20s %n", "No", "User");
        System.out.println("-----------------------------");
        System.out.printf("%-5s %-20s %n", "1", "Admin");
        System.out.printf("%-5s %-20s %n", "2", "Customer");
        System.out.println("-----------------------------");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan2 = masukan.nextInt();
        
        switch (pilihan2) {
            case 1:
                admin.login();
                System.out.println();
                System.out.println("=====================================");
                System.out.printf("%-5s %-20s %n", "No", "Opsi Admin");
                System.out.println("-----------------------------");
                System.out.printf("%-5s %-20s %n", "1", "Lihat kamar");
                System.out.printf("%-5s %-20s %n", "2", "Lihat booking");
                System.out.println("-----------------------------");

                System.out.print("Pilih opsi Admin: ");
                int pilihanAdmin = masukan.nextInt();
                if (pilihanAdmin == 1) {
                    admin.tampilKamar();
                } else if (pilihanAdmin == 2) {
                    admin.liatPesanan();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 2:
                customer.login();

                System.out.println("=====================================");
                System.out.printf("%-5s %-20s %n", "No", "Opsi Customer");
                System.out.println("-----------------------------");
                System.out.printf("%-5s %-20s %n", "1", "Cek ketersediaan kamar");
                System.out.printf("%-5s %-20s %n", "2", "Pesan kamar");
                System.out.printf("%-5s %-20s %n", "3", "Lihat booking");
                System.out.println("-----------------------------");

                System.out.print("Pilih opsi Customer: ");
                int pilihanPelanggan = masukan.nextInt();

                if (pilihanPelanggan == 1) {
                    customer.cekKetersediaan();
                } else if (pilihanPelanggan == 2) {
                    System.out.println("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomerKamar = masukan.nextInt();
                    System.out.println("Masukkan tanggal booking (YYYY-MM-DD): ");
                    String tanggal = masukan.next();
                    customer.pesanKamar(nomerKamar, tanggal);
                } else if (pilihanPelanggan == 3) {
                    customer.liatPesanan();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }     
    }
}
