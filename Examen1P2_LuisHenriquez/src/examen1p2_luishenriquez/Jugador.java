
package examen1p2_luishenriquez;


public class Jugador {


private String nombre;

private int edad;

private String nacionalidad;

private String pie;

private int rating;

private String equipo;

private int agarre;

private int lanzamiento;

private int fisico;

private int regate;

private int ritmo;

private int entrada;

private int vision;

private int passing;

private int disparo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pie, int rating, String equipo, int agarre, int lanzamiento, int fisico, int regate, int ritmo, int entrada, int vision, int passing, int disparo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pie = pie;
        this.rating = rating;
        this.equipo = equipo;
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.regate = regate;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.disparo = disparo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return  " Jugador" + 
                " Nombre = " + nombre + " "
                + " Edad = " + edad + " "
                + " Nacionalidad = " + nacionalidad + ""
                + " pie = " + pie + ""
                + " rating = " + rating + ""
                + " Equipo = " + equipo + ""
                + " Agarre = " + agarre + " "
                + " Lanzamiento = " + lanzamiento + ""
                + " Fisico = " + fisico + " "
                + " Regate = " + regate + ""
                + " Ritmo = " + ritmo + " "
                + " Entrada = " + entrada + ""
                + " Vision = " + vision + " "
                + " Passing = " + passing + " "
                + " Disparo = " + disparo ;
    }
    
}
