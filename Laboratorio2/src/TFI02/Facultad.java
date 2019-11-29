package TFI02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Facultad implements Informacion{
    private String nombre;
    private Set<Carrera> carreras = new HashSet<Carrera>();
    private Iterator<Carrera> iterador = carreras.iterator();

    public Facultad(String nombre,Set<Carrera> carreras){
     this.nombre = nombre;
     this.carreras = carreras;
    }

    public void agregarCarrera(Carrera carrera){
     carreras.add(carrera);
     iterador = carreras.iterator();

    }

    public void eliminarCarrera(){
        while(iterador.hasNext()){
            String nom = iterador.next().getNombre();
            if(nom.equals(nombre)){
                iterador.remove();
            }
        }
        System.out.println(nombre+" fue borrado");
    }
  /*
    public void eliminarEstudiantes(Estudiante estudiante){
          while(iterador.hasNext()){
              int nom = estudiante.hashCode();
              for(Carrera carrera : carreras){
                  if(nom = carrera.)
              }
          }

    }


   */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(Set<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String listarContenido() {
        String contenido = " ";
        for(Carrera carrera : carreras){
            contenido = carrera.toString() + " ";
        }
        return null;
    }

    @Override
    public int verCantidad() {
        return carreras.size();
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", carreras=" + carreras +
                '}';
    }
}
