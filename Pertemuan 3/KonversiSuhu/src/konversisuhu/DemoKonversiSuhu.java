package konversisuhu;
public class DemoKonversiSuhu {
    public static void main (String[] args) {
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        double celcius = 20.0;
        System.out.println("Suhu dalam Celsius: " + celcius + " derajat C");
        System.out.println("Konversi suhu Celcius ke Fahrenheit: " + konversiSuhu.celciusToFahrenheit(celcius) + " derajat F");
        System.out.println("Konversi suhu Celcius ke Reamur: " + konversiSuhu.celciusToReamur(celcius) + " derajat R\n");

        double Fahrenheit = 77.0;
        System.out.println("Suhu dalam Fahrenheit: " + Fahrenheit + " derajat F");
        System.out.println("Konversi suhu Fahrenheit ke Reamur: " + konversiSuhu2.fahrenheitToReamur(Fahrenheit, celcius) + " derajat R");
    }
}
