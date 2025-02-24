import cz.uhk.zlomky.model.Zlomek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoreni instance(=objekt) tridy zlomek
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(2, 5);
        Zlomek c = new Zlomek(6, 20);
        Zlomek d = new Zlomek(15, 8);

        System.out.printf("Zlomek a =  %s\n", a.toString());
        System.out.printf("Zlomek b =  %s\n", b.toString());
        System.out.printf("Zlomek c =  %s\n", c.toString());
        System.out.printf("Zlomek d =  %s\n", d.toString());

        System.out.printf("Zlomek a * b = %s\n", a.krat(b).zkratit());
        System.out.printf("Zlomek a / b = %s\n", a.deleno(b).zkratit());
        System.out.printf("Zlomek a + b = %s\n", a.plus(b).zkratit());
        System.out.printf("Zlomek a - b = %s\n", a.plus(b).zkratit());

        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = new Zlomek(3,0);

        try {
            Zlomek all = sumaZlomku(poleZlomku);
            System.out.printf("Soucet zlomku a, b, c, d je %s\n", all);
        } catch (ArithmeticException e) {
            System.out.println("Chyba pri vypoctu sumy zlomku: " + e.getMessage());
        }

        Number[] pole2 = new Number[8];
        for (int i = 0; i < poleZlomku.length; i++) {
            pole2[i] = poleZlomku[i];
        }

        pole2[4] = 10;
        pole2[5] = 20;
        pole2[6] = 30.025;
        pole2[7] = 40;
        double suma = 0;

        for (Number n : pole2) {
            System.out.printf("%s\n", n);
            suma += n.doubleValue();
        }
        System.out.printf("Suma: %s\n", suma);

    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);

        for (Zlomek z : pole) {
            soucet = soucet.plus(z); // soucet += z
        }

        return soucet.zkratit();
    }
}