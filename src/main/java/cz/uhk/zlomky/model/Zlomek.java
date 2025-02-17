package cz.uhk.zlomky.model;

public class Zlomek {
    private int citatel;
    private int jmenovatel;


    public int getCotatel() {
        return citatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }
}
