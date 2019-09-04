package TPN5;

/**
 * Created by adrian on 29/08/2019.
 */
public class UsoFacultad {
    public static void main(String[]args){
    Facultad nueva = new Facultad("UTN",3);
        System.out.println("agregar:");
    nueva.agregar();
    nueva.listarEstudiantes();
        System.out.println("buscar:");
    nueva.buscar();
    nueva.listarEstudiantes();
        System.out.println("borrar:");
        nueva.borrar();
        nueva.listarEstudiantes();
        System.out.println("cambiar nota:");
        nueva.cambiarNota();
        nueva.listarEstudiantes();

    }


}
