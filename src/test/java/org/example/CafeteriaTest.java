package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetNombre() {
        Cafeteria cafeteria = new Cafeteria("El mormon","los ganaderos 03701");
        assertEquals("El mormon", cafeteria.getNombre());
    }

    @Test
    void testSetNombre() {
        Cafeteria cafeteria = new Cafeteria("El mormon","los ganaderos 03701");
        cafeteria.setNombre("El evangelico");
        assertEquals("El evangelico", cafeteria.getNombre());
    }

    @Test
    void testGetDireccion() {
        Cafeteria cafeteria = new Cafeteria("El mormon","los ganaderos 03701");
        assertEquals("los ganaderos 03701", cafeteria.getDireccion());
    }

    @Test
    void testSetDireccion() {
        Cafeteria cafeteria = new Cafeteria("El mormon","los ganaderos 03701");
        cafeteria.setDireccion("Av alemania 03701");
        assertEquals("Av alemania 03701", cafeteria.getDireccion());
    }

    @Test
    void testGetRedesSociales() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria 1", "Calle 123");
        cafeteria.agregarRedSocial("Facebook");
        cafeteria.agregarRedSocial("Instagram");

        ArrayList<String> redesEsperadas = new ArrayList<>();
        redesEsperadas.add("Facebook");
        redesEsperadas.add("Instagram");

        ArrayList<String> redesObtenidas = cafeteria.getRedesSociales();

        assertEquals(redesEsperadas, redesObtenidas);
    }

    @Test
    void testSetRedesSociales() {
        Cafeteria cafeteria = new Cafeteria("El mormon","los ganaderos 03701");
        ArrayList<String> redesSociales = new ArrayList<>();
        redesSociales.add("Facebook");
        redesSociales.add("Instagram");
        cafeteria.setRedesSociales(redesSociales);
        assertEquals(redesSociales, cafeteria.getRedesSociales());
    }

    @Test
    void testGetListaDeCafes() {
        Cafeteria cafeteria = new Cafeteria("Mi Cafetería", "Los Ganaderos 03701");

        Cafe cafe1 = new Cafe(10, 20, "grande");
        Cafe cafe2 = new Cafe(11, 21, "mediano");
        Cafe cafe3 = new Cafe(12, 22, "pequeño");
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        cafeteria.agregarCafe(cafe3);

        ArrayList<Cafe> listaDeCafes = cafeteria.getListaDeCafes();
        assertEquals(3, listaDeCafes.size());
    }

    @Test
    void testSetListaDeCafes() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria1", "Direccion1");
        ArrayList<Cafe> nuevaListaDeCafes = new ArrayList<>();
        nuevaListaDeCafes.add(new Cafe(10, 100, "grende"));
        nuevaListaDeCafes.add(new Cafe(20, 200, "mediano"));

        cafeteria.setListaDeCafes(nuevaListaDeCafes);

        ArrayList<Cafe> listaDeCafes = cafeteria.getListaDeCafes();
        assertEquals(nuevaListaDeCafes, listaDeCafes);
    }
    @Test
    void testGetListaDeKuchen() {
        Cafeteria cafeteria = new Cafeteria("Mi Cafetería", "Los Ganaderos 03701");

        Kuchen kuchen1 = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        Kuchen kuchen2 = new Kuchen("kuchen de platano", 30, "platano", 30);
        Kuchen kuchen3 = new Kuchen("kuchen de frambuesa", 40, "frambuesa", 40);

        cafeteria.agregarKuchen(kuchen1);
        cafeteria.agregarKuchen(kuchen2);
        cafeteria.agregarKuchen(kuchen3);

        ArrayList<Kuchen> listaDeKuchen = cafeteria.getListaDeKuchen();
        assertEquals(3, listaDeKuchen.size());
    }

    @Test
    void testSetListaDeKuchen() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria1", "Direccion1");
        ArrayList<Kuchen> nuevaListaDeKuchen = new ArrayList<>();
        nuevaListaDeKuchen.add(new Kuchen("kuchen de manzana", 20, "manzana", 20));
        nuevaListaDeKuchen.add(new Kuchen("kuchen de platano", 30, "platano", 30));

        cafeteria.setListaDeKuchen(nuevaListaDeKuchen);

        ArrayList<Kuchen> listaDeKuchen = cafeteria.getListaDeKuchen();
        assertEquals(nuevaListaDeKuchen, listaDeKuchen);
    }

    @Test
    void testAgregarCafe() {
        Cafeteria cafeteria = new Cafeteria("Mi Cafetería", "Calle 123");
        Cafe cafe = new Cafe(10, 2.5, "grande");
        cafeteria.agregarCafe(cafe);
        assertEquals(cafe, cafeteria.getListaDeCafes().get(0));
    }
    @Test
    void testAgregarKuchen() {
        Cafeteria cafeteria = new Cafeteria("Mi Cafetería", "Calle 123");
        Kuchen kuchen = new Kuchen("kuchen de platano", 30, "platano", 30);
        cafeteria.agregarKuchen(kuchen);
        assertEquals(kuchen, cafeteria.getListaDeCafes().get(0));
    }

    @Test
    void testAgregarRedSocial() {
        Cafeteria cafeteria = new Cafeteria("Cafeteria Test", "Calle Falsa 123");
        String redSocial = "Facebook";
        ArrayList<String> redesSocialesEsperadas = new ArrayList<>();

        redesSocialesEsperadas.add(redSocial);
        cafeteria.agregarRedSocial(redSocial);

        assertEquals(redesSocialesEsperadas, cafeteria.getRedesSociales());
    }

    @Test
    void testEliminarCafe() {
        Cafe cafe1 = new Cafe(10, 10,"grande");
        Cafe cafe2 = new Cafe(100, 100,"mediano");
        Cafeteria cafeteria = new Cafeteria("Starbucks", "123 Main St");
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        cafeteria.eliminarCafe(cafe1);
        ArrayList<Cafe> listaDeCafes = cafeteria.getListaDeCafes();
        assertEquals(1, listaDeCafes.size());
        assertEquals(cafe2, listaDeCafes.get(0));
    }
    @Test
    void testEliminarKuchen() {
        Kuchen kuchen1 = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        Kuchen kuchen2 = new Kuchen("kuchen de platano", 30, "platano", 30);
        Cafeteria cafeteria = new Cafeteria("Starbucks", "123 Main St");
        cafeteria.agregarKuchen(kuchen1);
        cafeteria.agregarKuchen(kuchen2);
        cafeteria.eliminarKuchen(kuchen1);
        ArrayList<Kuchen> listaDeKuchen = cafeteria.getListaDeKuchen();
        assertEquals(1, listaDeKuchen.size());
        assertEquals(kuchen2, listaDeKuchen.get(0));
    }

    @Test
    void testBuscarKuchenPorNombre() {
        Kuchen kuchen1 = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        Kuchen kuchen2 = new Kuchen("kuchen de platano", 30, "platano", 30);
        Cafeteria cafeteria = new Cafeteria("Starbucks", "123");
        cafeteria.agregarKuchen(kuchen1);
        cafeteria.agregarKuchen(kuchen2);
        Kuchen kuchenEncontrado = cafeteria.buscarKuchenPorNombre("kuchen de manzana");
        assertEquals(kuchen1, kuchenEncontrado);
    }
    @Test
    void testBuscarCafePorTamaño() {
        Cafe cafe1 = new Cafe(10, 100, "grande");
        Cafe cafe2 = new Cafe(20, 200, "mediano");
        Cafeteria cafeteria = new Cafeteria("Starbucks", "123");
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        Cafe cafeEncontrado = cafeteria.buscarCafePorTamano("grande");
        assertEquals(cafe1, cafeEncontrado);
    }


    @Test
    void testToString() {
        Cafeteria elMormon = new Cafeteria("El Mormón", "Los ganaderos 03701");
        Cafe cafe1 = new Cafe(15, 150, "Pequeño");
        Cafe cafe2 = new Cafe(25, 250, "Mediano");
        Cafe cafe3 = new Cafe(35, 350, "Grande");
        elMormon.agregarCafe(cafe1);
        elMormon.agregarCafe(cafe2);
        elMormon.agregarCafe(cafe3);
        elMormon.agregarRedSocial("Instagram: Cafeteria_El_Mormon");
        elMormon.agregarRedSocial("Facebook: Cafeteria EL Mormon");
        String esperado = "Cafeteria{nombre='El Mormón', direccion='Los ganaderos 03701', redesSociales=[Instagram: Cafeteria_El_Mormon, Facebook: Cafeteria EL Mormon], listaDeCafes=[Café{gramosDeCafe=15.0, mililitrosDeAgua=150.0, tamaño='Pequeño'}, Café{gramosDeCafe=25.0, mililitrosDeAgua=250.0, tamaño='Mediano'}, Café{gramosDeCafe=35.0, mililitrosDeAgua=350.0, tamaño='Grande'}], listaDeKuchen=[]}";
        assertEquals(esperado, elMormon.toString());
    }
}