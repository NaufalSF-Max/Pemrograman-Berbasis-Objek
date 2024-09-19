package polimorfisme;
public class Kubus {
    double s;

    public Kubus(double s) {
        this.s = s;
    }
    public double volume() {
        return s * s * s;
    }
    public double surfaceArea() {
        return 6 * s * s;
    }
}
