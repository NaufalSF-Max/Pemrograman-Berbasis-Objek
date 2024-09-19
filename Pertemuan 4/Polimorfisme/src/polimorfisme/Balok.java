package polimorfisme;
public class Balok extends Shape {
    double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    public double volume() {
        return p * l * t;
    }
    public double surfaceArea() {
        return 2 * (p * l + p * t + t * l);
    }
}
