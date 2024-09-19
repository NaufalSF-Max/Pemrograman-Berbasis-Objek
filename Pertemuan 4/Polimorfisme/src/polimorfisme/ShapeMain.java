package polimorfisme;
public class ShapeMain {
    public static void main(String[] args) {
        Balok balok = new Balok(10, 5, 8);
        System.out.println("Volume Balok        : " + balok.volume());
        System.out.println("Luas Permukaan Balok: " + balok.surfaceArea());

        Kubus kubus = new Kubus(10);
        System.out.println("Volume Kubus        : " + kubus.volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.surfaceArea());
    }
}
