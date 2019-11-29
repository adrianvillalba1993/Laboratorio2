package TFI02;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> estudiantes = new HashSet<Estudiante>();
    private Iterator<Estudiante> iterador = estudiantes.iterator();

    public Materia(String nombre,Set<Estudiante> estudiantes){
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante){
          estudiantes.add(estudiante);
          iterador = estudiantes.iterator();
    }

    public void eliminarEstudiante(String nombre){
           while(iterador.hasNext()){
               String nom = iterador.next().getNombre();

               if(nom.equals(nombre)){
                   iterador.remove();
               }
           }
    }

    public void modificarTitular(Profesor profesor){
        titular.setNombre(profesor.getNombre());
        titular.setApellido(profesor.getApellido());
        titular.setLegajo(profesor.getLegajo());
        titular.setAntiguedad(profesor.getAntiguedad());
        titular.setSueldo(profesor.getSueldo());


    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Materia materia = (Materia) o;

        return nombre.equals(materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String listarContenido() {
        String contenido= "";
        for(Estudiante estudiante : estudiantes){
            contenido = estudiante.toString() + " ";
        }

        return contenido;
    }

    @Override
    public int verCantidad() {
        return estudiantes.size();
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", estudiantes=" + estudiantes +
                ", iterador=" + iterador +
                '}';
    }
}
