package TPN5;

import java.util.Scanner;

/**
 * Created by adrian on 04/09/2019.
 */
public class Menu {
    private Facultad[] facultades;
    private int opcion;
    boolean testeo;

    public Menu(){
        facultades = new Facultad[5];
        opcion = 0;
        testeo = false;
    }

    public void opcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1-crear\n2-agregar\n3-borrar\n4-cambiar nota\n5-nombre de la facultad\n6-listar alumnos\n7-salir\n");
        System.out.println("elegir una opcion:");
        this.testeo = teclado.hasNextInt();
        if(testeo){
            opcion = teclado.nextInt();
        }else{
            opcion = 0;
        }
        switch(opcion){
            case 1:
                for(int i=0;i<facultades.length;i++){
                    if(facultades[i] == null){
                        String nombre;
                        int valor;
                        Scanner nuevo = new Scanner(System.in);
                        System.out.println("nombre de la facultad:");
                        nombre = teclado.nextLine();
                        System.out.println("cantidad de estudiantes:");
                        valor = teclado.nextInt();
                        facultades[i] = new Facultad(nombre,valor);
                        opcion();
                    }
                }
                break;
            case 2:
                for(int i=0;i<facultades.length;i++){
                    if(facultades[i+1] == null){
                        System.out.println("se agregaran los alumnos de la facultad actual:");
                        facultades[i].agregar();
                        opcion();
                    }
                }
                break;
            case 3:
                for(int i=0;i<facultades.length;i++){
                    if(facultades[i+1] == null){
                        facultades[i].borrar();
                        opcion();
                    }
                }
                break;
            case 4:
                for (int i=0;i<facultades.length;i++){
                    if(facultades[i+1] ==null){
                        facultades[i].cambiarNota();
                    opcion();
                    }
                }
                break;
            case 5:
                for(int i=0;i<facultades.length;i++){
                    if(facultades[i+1] == null){
                        facultades[i].getNombre();
                        opcion();
                    }
                }
                break;
            case 6:
                for(int i=0;i<facultades.length;i++){
                    if(facultades[i+1] == null){
                        facultades[i].listarEstudiantes();
                    opcion();
                    }
                }
                break;
            case 7:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("error: valor ingresado es incorrecto ");
                opcion();
        }
    }
}
