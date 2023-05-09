package org.example;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaDeCafes;
    public Cafeteria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = new ArrayList<>();
        this.listaDeCafes = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(ArrayList<String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    public ArrayList<Cafe> getListaDeCafes() {
        return listaDeCafes;
    }

    public void setListaDeCafes(ArrayList<Cafe> listaDeCafes) {
        this.listaDeCafes = listaDeCafes;
    }
    public void agregarCafe(Cafe cafe){
        this.listaDeCafes.add(cafe);
    }
    public void agregarRedSocial(String redSocial){
        this.redesSociales.add(redSocial);
    }
    public void eliminarCafe(Cafe cafe){
        this.listaDeCafes.remove(cafe);
    }
    public Cafe buscarCafePorTamano(String tamaño) {
        for (Cafe cafe : listaDeCafes) {
            if (cafe.getTamaño() == tamaño) {
                return cafe;
            }
        }
        return null;
    }
    public String toString() {
        String listaCafes = "";
        for (Cafe cafe : this.listaDeCafes) {
            listaCafes += cafe.toString() + "\n";
        }

        return "Cafeteria: " + this.nombre + "\n" +
                "Direccion: " + this.direccion + "\n" +
                "Redes sociales: " + this.redesSociales + "\n" +
                "Cafes a la venta:\n" + listaCafes;
    }
}
