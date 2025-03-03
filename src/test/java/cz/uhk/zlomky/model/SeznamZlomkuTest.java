package cz.uhk.zlomky.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {

    SeznamZlomku seznam = new SeznamZlomku();


    @Test
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        assertEquals(1, seznam.pocetZlomku(),"Pocet zlomku");
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(),  "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void odebratZlomek() {
    }

    @Test
    void vratZlomek() {
    }

    @Test
    void spoctiSoucet() {
        fail();
    }

    @Test
    void spoctiPrumer() {
        fail();
    }
}