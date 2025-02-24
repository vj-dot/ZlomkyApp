package cz.uhk.zlomky.model;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @org.junit.jupiter.api.Test
    void krat() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(12, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void kratNulovy() {
        Zlomek a = new Zlomek(0, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void deleno() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.deleno(b);
        assertEquals(15, c.getCitatel(), "Chybny citatel");
        assertEquals(16, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void plus() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.plus(b);
        assertEquals(31, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.minus(b);
        assertEquals(-1, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void zkratit() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b).zkratit();
        assertEquals(3, c.getCitatel(), "Chybny citatel");
        assertEquals(5, c.getJmenovatel(), "Chybny jmenovatel");
    }
}