package cz.uhk.zlomky.model;

public class Zlomek extends Number {
    private final int citatel;
    private final int jmenovatel;


    public int getCitatel() {
        return citatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    // operace se zlomky
    public Zlomek krat(Zlomek b) {
        Zlomek c = new Zlomek(citatel * b.citatel, jmenovatel * b.jmenovatel);
        return c;
    }

    public Zlomek deleno(Zlomek b) {
        Zlomek c = new Zlomek(citatel * b.jmenovatel, jmenovatel * b.citatel);
        return c;
    }

    public Zlomek plus(Zlomek b) {
        Zlomek c = new Zlomek(citatel * b.jmenovatel + b.citatel * jmenovatel, jmenovatel * b.jmenovatel);
        return c;
    }

    public Zlomek minus(Zlomek b) {
        Zlomek c = new Zlomek(citatel * b.jmenovatel - b.citatel * jmenovatel, jmenovatel * b.jmenovatel);
        return c;
    }

    public Zlomek zkratit() {
        int a = Math.abs(citatel);
        int b = Math.abs(jmenovatel);
        if (a < b) {
            int pom = a;
            a = b;
            b = pom;
        }

        int zb;
        if (b != 0) {
            do {
                zb = a % b;
                a = b;
                b = zb;
            } while (zb != 0);
            return new Zlomek(citatel / a, jmenovatel / a);
        } else {
            return new Zlomek(0,1);
        }

    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }

    @Override
    public int intValue() {
        return citatel / jmenovatel;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double)citatel) / jmenovatel;
    }
}
