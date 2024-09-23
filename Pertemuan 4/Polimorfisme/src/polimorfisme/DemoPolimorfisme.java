package polimorfisme;
public class DemoPolimorfisme {
    public static void main(String[] args) {
        BangunRuang balok = new BangunRuang(10, 5, 8);
        System.out.println("Volume Balok        : " + balok.volumeBalok());
        System.out.println("Luas Permukaan Balok: " + balok.luasBalok());

        BangunRuang kubus = new BangunRuang(10);
        System.out.println("Volume Kubus        : " + kubus.volumeKubus());
        System.out.println("Luas Permukaan Kubus: " + kubus.luasKubus());
    }
}