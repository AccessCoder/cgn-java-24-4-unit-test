package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test //Annotation
    void add_shouldReturn7_whenCalledWith5And2() {
        //GIVEN -> Bekannte Werte
        int a = 5;
        int b = 2;
        int expected = 7;

        //WHEN -> Tatsächlicher Methodenaufruf
        int actual = Main.add(a,b);
        //THEN -> Vergleich Erwartung mit Realität
        assertEquals(expected, actual);
    }

    @Test //Annotation
    void add_shouldReturn10_whenCalledWith5And5() {
        //GIVEN -> Bekannte Werte
        int expected = 10;

        //WHEN -> Tatsächlicher Methodenaufruf
        int actual = Main.add(5,5);
        //THEN -> Vergleich Erwartung mit Realität
        assertEquals(expected, actual);
    }

    @Test //Annotation
    void add_shouldReturn4_whenCalledWith2And2() {
       assertEquals(4, Main.add(2,2));
    }

}