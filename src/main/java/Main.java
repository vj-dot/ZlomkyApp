import cz.uhk.zlomky.model.Zlomek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoreni instance(=objekt) tridy zlomek
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(2, 5);

        System.out.printf("Zlomek a =  %s\n", a.toString());
        System.out.printf("Zlomek b =  %s\n", b.toString());

        Zlomek krat = a.krat(b).zkratit();
        System.out.printf("Zlomek a * b = %s\n", krat.toString());
        Zlomek deleno = a.deleno(b).zkratit();
        System.out.printf("Zlomek a / b = %s\n", deleno.toString());
        Zlomek plus = a.plus(b).zkratit();
        System.out.printf("Zlomek a + b = %s\n", plus.toString());
        Zlomek minus = a.minus(b).zkratit();
        System.out.printf("Zlomek a - b = %s\n", minus.toString());
    }
}