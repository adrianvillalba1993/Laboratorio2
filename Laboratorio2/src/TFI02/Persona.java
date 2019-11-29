package TFI02;

import java.util.Objects;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

     public Persona(String nombre,String apellido,int legajo){
         this.nombre = nombre;
         this.apellido = apellido;
         this.legajo = legajo;
     }

    public abstract void modificarDatos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return legajo == persona.legajo ;
    }

    @Override
    public int hashCode() {
           int result = 31;
        return result+1+legajo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
