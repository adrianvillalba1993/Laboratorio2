package TPN5;

import java.util.Scanner;

/**
 * Created by adrian on 29/08/2019.
 */
public class Facultad {
    private String nombre;
    private int cantEstudiantes;
    private int id;
    private static int contador=1;
    private Estudiante[] estudiantes;

    //punto 2.a)
    public Facultad(String nombre,int cantEstudiantes){
        this.nombre = nombre;
        this.cantEstudiantes = cantEstudiantes;
        this.id = contador;
        this.contador++;
        estudiantes = new Estudiante[this.cantEstudiantes];
    }

    //punto 2.b)
    public void agregar(){

        for (int i=0;i<estudiantes.length;i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresar nombre del estudiante:");
            String nombre = teclado.nextLine();
            System.out.println("ingresar nota:");
            double nota = teclado.nextDouble();
            estudiantes[i] = new Estudiante(nombre,nota);

        }
    }
    //punto 2.c)
    public void listarEstudiantes(){
        for (int i=0;i<estudiantes.length;i++){
            if(estudiantes[i] == null){
                System.out.println(" ");
            }else {
                System.out.println(estudiantes[i].toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //2.f)borrar usando equals para comparar 2 strings
    public void borrar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("estudiante a borrar:");
        String borrado = teclado.nextLine();


        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i].getNombre().equalsIgnoreCase(borrado)){
                for(int j = i; j < estudiantes.length - 1; j++){
                    estudiantes[j] = estudiantes[j+1];
                }
                break;
            }
        }
    }

    //2.d INCOMPLETO (error por reemplazo donde copia objeto sgte en posicion eliminada)
    public void buscar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("estudiante a buscar:");
        String buscar = teclado.nextLine();
        for(int i = 0; i< estudiantes.length; i++){
            if(estudiantes[i].getNombre().equalsIgnoreCase(buscar)){
                System.out.println(estudiantes[i].getNombre()+" se encuentra en esta facultad");
            }
        }
    }

    public void cambiarNota(){
        String nombre=" ";
        int valor=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar nombre del estudiante:");
        if(teclado.hasNextLine()) {
            nombre = teclado.nextLine();
        }
        System.out.println("ingresar nueva nota:");
        if(teclado.hasNextInt()){
            valor = teclado.nextInt();
        }
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i].getNombre().equalsIgnoreCase(nombre)){
                estudiantes[i].setNota(valor);
            }
        }
    }





}
