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

        elMormon.agregarCafe(cafe1);
        elMormon.agregarCafe(cafe2);
        elMormon.agregarCafe(cafe3);

        elMormon.agregarRedSocial("Instagram: Cafeteria_El_Mormon");
        elMormon.agregarRedSocial("Facebook: Cafeteria EL Mormon");

        System.out.println(elMormon.toString());
    }
}