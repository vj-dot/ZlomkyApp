package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {

    SeznamZlomku seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test pridavani")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        assertEquals(1, seznam.pocetZlomku(),"Pocet zlomku");
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(),  "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }
    @Test
    @DisplayName("Test pridani null")
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class, () -> seznam.pridatZlomek(null));
    }

    @Test
    void vratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(),  "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void vratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        seznam.odebratZlomek(0);
        assertEquals(0, seznam.pocetZlomku(),"Seznam ma byt prazdny");
    }

    @Test
    void odebratZlomekSpatnyIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.odebratZlomek(0));
    }

    @Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(1,2));
        seznam.pridatZlomek(new Zlomek(1,3));
        seznam.pridatZlomek(new Zlomek(1,4));
        Zlomek soucet = seznam.spoctiSoucet();
        assertEquals(13, soucet.getCitatel(),  "Citatel");
        assertEquals(12, soucet.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiSoucetZPrazdneho() {
        Zlomek soucet = seznam.spoctiSoucet();
        assertEquals(0, soucet.getCitatel(),  "Citatel");
        assertEquals(1, soucet.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(1,2));
        seznam.pridatZlomek(new Zlomek(1,4));
        Zlomek prumer = seznam.spoctiPrumer();
        assertEquals(3, prumer.getCitatel(),  "Citatel");
        assertEquals(8, prumer.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiPrumerZPrazdneho() {
        assertThrows(ArithmeticException.class, () -> seznam.spoctiPrumer());
    }
}