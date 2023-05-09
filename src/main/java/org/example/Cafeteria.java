package org.example;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaDeCafes;
    private ArrayList<Kuchen> listaDeKuchen;
    public Cafeteria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = new ArrayList<>();
        this.listaDeCafes = new ArrayList<>();
        this.listaDeKuchen = new ArrayList<>();
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
    public ArrayList<Kuchen> getListaDeKuchen() {
        return listaDeKuchen;
    }
    public void setListaDeKuchen(ArrayList<Kuchen> listaDeKuchen) {
        this.listaDeKuchen = listaDeKuchen;
    }
    public void agregarCafe(Cafe cafe){
        this.listaDeCafes.add(cafe);
    }
    public void agregarKuchen(Kuchen kuchen){
        this.listaDeKuchen.add(kuchen);
    }
    public void agregarRedSocial(String redSocial){
        this.redesSociales.add(redSocial);
    }
    public void eliminarCafe(Cafe cafe){
        this.listaDeCafes.remove(cafe);
    }
    public void eliminarKuchen(Kuchen kuchen){
        this.listaDeKuchen.remove(kuchen);
    }
    public Cafe buscarCafePorTamano(String tamaño) {
        for (Cafe cafe : listaDeCafes) {
            if (cafe.getTamaño() == tamaño) {
                return cafe;
            }
        }
        return null;
    }
    public Kuchen buscarKuchenPorNombre(String nombre) {
        for (Kuchen kuchen : listaDeKuchen) {
            if (kuchen.getNombre() == nombre) {
                return kuchen;
            }
        }
        return null;
    }

    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", redesSociales=" + redesSociales +
                ", listaDeCafes=" + listaDeCafes +
                ", listaDeKuchen=" + listaDeKuchen +
                '}';
    }
}
