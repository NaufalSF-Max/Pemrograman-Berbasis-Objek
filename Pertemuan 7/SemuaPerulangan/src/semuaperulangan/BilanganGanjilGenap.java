package semuaperulangan;

public class BilanganGanjilGenap {
    public void GanjilGenap() {
        System.out.println("=================================================");
        System.out.println("         Deret Bilangan Ganjil Genap 0 -20       ");
        System.out.println("=================================================");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("=  " + i + "  =       merupakan bilangan genap");
            } else {
                System.out.println("=  " + i + "  =       merupakan bilangan ganjil");
            }
        }
        System.out.println("=================================================");

    }
}
