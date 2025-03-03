package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

public class seznamZlomkuApp {
    public static void main(String[] args) {
        SeznamZlomku seznam = new SeznamZlomku();

        seznam.pridatZlomek(new Zlomek(1,2));
        seznam.pridatZlomek(new Zlomek(2,3));
        seznam.pridatZlomek(new Zlomek(7,8));
        seznam.pridatZlomek(new Zlomek(-4,5));

        seznam.vypisZlomky(System.out);

        Zlomek suma = seznam.spoctiSoucet();
        // System.out.printf("Suma: %s\n",suma);
        System.out.println("Soucet zlomku je " + suma);
        System.out.println("Soucet zlomku realne je " + suma.doubleValue());

        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("Prumer zlomku je " + prumer);
        System.out.println("Prumer zlomku realne je " + prumer.doubleValue());

    }

    public int pocetZlomku(SeznamZlomku seznam) {
        return seznam.pocetZlomku();
    }
}
