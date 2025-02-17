import cz.uhk.zlomky.model.Zlomek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoreni instance(=objekt) tridy zlomek
        Zlomek a = new Zlomek(1, 2);

        System.out.printf("Zlomek a =  %s\n", a.toString());
    }
}