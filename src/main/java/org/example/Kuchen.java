package org.example;

public class Kuchen {
    private String nombre;
    private double gramosDeHarina;
    private String tipoDeFruta;
    private double gramosDeAzucar;

    public Kuchen(String nombre, double gramosDeHarina, String tipoDeFruta, double gramosDeAzucar) {
        this.nombre = nombre;
        this.gramosDeHarina = gramosDeHarina;
        this.tipoDeFruta = tipoDeFruta;
        this.gramosDeAzucar = gramosDeAzucar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGramosDeHarina() {
        return gramosDeHarina;
    }

    public void setGramosDeHarina(double gramosDeHarina) {
        this.gramosDeHarina = gramosDeHarina;
    }

    public String getTipoDeFruta() {
        return tipoDeFruta;
    }

    public void setTipoDeFruta(String tipoDeFruta) {
        this.tipoDeFruta = tipoDeFruta;
    }

    public double getGramosDeAzucar() {
        return gramosDeAzucar;
    }

    public void setGramosDeAzucar(double gramosDeAzucar) {
        this.gramosDeAzucar = gramosDeAzucar;
    }


    public String toString() {
        return "Kuchen{" +
                "nombre='" + nombre + '\'' +
                ", gramosDeHarina=" + gramosDeHarina +
                ", tipoDeFruta='" + tipoDeFruta + '\'' +
                ", gramosDeAzucar=" + gramosDeAzucar +
                '}';
    }
}
