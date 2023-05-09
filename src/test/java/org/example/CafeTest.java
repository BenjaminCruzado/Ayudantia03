package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetGramosDeCafe() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        assertEquals(10.0, cafe.getGramosDeCafe());
    }

    @Test
    void testSetGramosDeCafe() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        cafe.setGramosDeCafe(20.0);
        assertEquals(20.0, cafe.getGramosDeCafe());
    }

    @Test
    void testGetMilimetrosDeAgua() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        assertEquals(100.0, cafe.getMilimetrosDeAgua());
    }

    @Test
    void testSetMlAgua() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        cafe.setMlAgua(200.0);
        assertEquals(200.0, cafe.getMilimetrosDeAgua());
    }

    @Test
    void testGetTamaño() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        assertEquals("grande", cafe.getTamaño());
    }

    @Test
    void testSetTamaño() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        cafe.setTamaño("mediano");
        assertEquals("mediano", cafe.getTamaño());
    }

    @Test
    void testToString() {
        Cafe cafe = new Cafe(10.0, 100.0, "grande");
        assertEquals("Café{gramosDeCafe=10.0, mililitrosDeAgua=100.0, tamaño='grande'}", cafe.toString());
    }
}