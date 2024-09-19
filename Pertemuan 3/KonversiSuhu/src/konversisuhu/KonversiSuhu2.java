package konversisuhu;
public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double fahrenheit, double celcius) {
        celcius = (fahrenheit - 32) * 5/9;
        return celciusToReamur(celcius);
    }
}
