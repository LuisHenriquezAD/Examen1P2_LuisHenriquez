/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_luishenriquez;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class Equipo {
    
    private String nombre;
    
    private String pais;
    
    private int rating;

    public Equipo() {
    }

    public Equipo(String nombre, String pais, int rating) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Equipo " + "nombre=" + nombre + ", pais=" + pais + ", rating=" + rating ;
    }
    
    
    
    
}
