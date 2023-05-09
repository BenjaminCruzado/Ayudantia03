package org.example;

public class Main {
    public static void main(String[] args) {
        ejecutar();
    }
    public static void ejecutar(){
        Cafeteria elMormon = new Cafeteria("El Mormón", "Los ganaderos 03701");

        Cafe cafe1 = new Cafe(15, 150, "Pequeño");
        Cafe cafe2 = new Cafe(25, 250, "Mediano");
        Cafe cafe3 = new Cafe(35, 350, "Grande");

        Kuchen kuchen1 = new Kuchen("kuchen de manzana", 20, "manzana", 20);
        Kuchen kuchen2 = new Kuchen("kuchen de platano", 30, "platano", 30);
        Kuchen kuchen3 = new Kuchen("kuchen de frambuesa", 40, "frambuesa", 40);

        elMormon.agregarCafe(cafe1);
        elMormon.agregarCafe(cafe2);
        elMormon.agregarCafe(cafe3);

        elMormon.agregarKuchen(kuchen1);
        elMormon.agregarKuchen(kuchen2);
        elMormon.agregarKuchen(kuchen3);

        elMormon.agregarRedSocial("Instagram: Cafeteria_El_Mormon");
        elMormon.agregarRedSocial("Facebook: Cafeteria EL Mormon");

        System.out.println(elMormon.toString());
    }
}