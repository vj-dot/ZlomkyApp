import cz.uhk.zlomky.model.Zlomek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoreni instance(=objekt) tridy zlomek
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(2, 5);
        Zlomek c = new Zlomek(9, 10);
        Zlomek d = new Zlomek(5, 6);

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
        poleZlomku[3] = d;

        Zlomek all = sumaZlomku(poleZlomku);
        System.out.printf("Soucet zlomku a, b, c, d je %s\n", all);
    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);

        for (Zlomek z : pole) {
            soucet = soucet.plus(z); // soucet += z
        }

        return soucet.zkratit();
    }
}