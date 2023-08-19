
package examen1p2_luishenriquez;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class Estadio {
    
    private String nombre;
    
    private String ciudad;
    
    private int capacidad;
    
    private String equipo;

    public Estadio() {
    }

    public Estadio(String nombre, String ciudad, int capacidad, String equipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Estadio" + "nombre=" + nombre + ", ciudad=" + ciudad + ", capacidad=" + capacidad + ", equipo=" + equipo ;
    }
    
    
    
    
}
