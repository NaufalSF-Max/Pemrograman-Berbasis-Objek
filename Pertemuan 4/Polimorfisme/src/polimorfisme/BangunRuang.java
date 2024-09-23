package polimorfisme;
public class BangunRuang {
    double p, l, t, s;

    public BangunRuang(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public BangunRuang(double s) {
        this.s = s;
    }
    public double volumeBalok(){
        return p*l*t;
    }

    public double luasBalok(){
        return 2*(p*l + p*t + l*t);
    }
    
    public double volumeKubus(){
        return s*s*s;
    }

    public double luasKubus(){
        return 6*s*s;
    }
}
