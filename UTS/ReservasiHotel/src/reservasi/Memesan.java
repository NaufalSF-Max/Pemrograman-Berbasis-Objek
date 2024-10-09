package reservasi;
public class Memesan {
    private String namaPelanggan, tanggalPesan;
    private Kamar kamar;
    
    public Memesan(String namaPelanggan, Kamar kamar, String tanggalPesan) {
        this.namaPelanggan = namaPelanggan;
        this.kamar = kamar;
        this.tanggalPesan = tanggalPesan;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public String getTanggalPesan() {
        return tanggalPesan;
    }

    public void tampilPesanan() {
        System.out.println("=====================================");
        System.out.printf("Nama Customer: %s%n", namaPelanggan);
        System.out.printf("Nomor Kamar: %d%n", kamar.getNomerKamar());
        System.out.printf("Tipe Kamar: %s%n", kamar.getTipeKamar());
        System.out.printf("Lama Menginap: %d malam%n", tanggalPesan);
        System.out.println("=====================================");
    }
    
    public String toString() {
        return "Dipesan oleh " + namaPelanggan + " untuk kamar: " + kamar.getNomerKamar() + " pada tanggal " + tanggalPesan;
    }
}
