package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KuchenTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testGetNombre() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        assertEquals("kuchen de manzana", kuchen.getNombre());
    }

    @Test
    void testSetNombre() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        kuchen.setNombre("kuchen de platano");
        assertEquals("kuchen de platano", kuchen.getNombre());
    }

    @Test
    void testGetGramosDeHarina() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        assertEquals(20, kuchen.getGramosDeHarina());
    }

    @Test
    void testSetGramosDeHarina() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        kuchen.setGramosDeHarina(30);
        assertEquals(30, kuchen.getGramosDeHarina());
    }

    @Test
    void testGetTipoDeFruta() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        assertEquals("manzana", kuchen.getTipoDeFruta());
    }

    @Test
    void testSetTipoDeFruta() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        kuchen.setTipoDeFruta("platano");
        assertEquals("platano", kuchen.getTipoDeFruta());
    }

    @Test
    void testGetGramosDeAzucar() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        assertEquals(20, kuchen.getGramosDeAzucar());
    }

    @Test
    void testSetGramosDeAzucar() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        kuchen.setGramosDeAzucar(30);
        assertEquals(30, kuchen.getGramosDeAzucar());
    }

    @Test
    void testToString() {
        Kuchen kuchen = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        assertEquals("Kuchen{nombre='kuchen de manzana', gramosDeHarina=20.0, tipoDeFruta='manzana', gramosDeAzucar=20.0}", kuchen.toString());

    }
}