package TFI01;

import java.awt.peer.DesktopPeer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {
    public static void main(String[]args){
        int cantidad = 5;
        String nombre;
        int edad;
        int silla;
        String fila;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("ingresar cantidad de expectadores:");
            cantidad = teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ERRROR AL INGRESAR DATOS");
        }
        Espectadores[] espectadores = new Espectadores[cantidad];

        try{


            for (int i = 0 ; i<espectadores.length;i++){
                Scanner sc = new Scanner(System.in);
                System.out.println("ingresar nombre:");
                nombre = sc.next();
                System.out.println("ingresar edad");
                edad = sc.nextInt();
                System.out.println("ingresar fila:");
                fila  = sc.next();
                System.out.println("");
                System.out.println("ingresar silla:");
                silla = sc.nextInt();
                espectadores[i] = new Espectadores(nombre,edad,fila,silla);
            }

        }catch(InputMismatchException e){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        }


        Salas sala01 = new Salas(3,"jocker");
        sala01.setEspectadores(espectadores);
        sala01.getEspectadores();
        System.out.println("**Espectadores**");
        System.out.println(sala01.getEspectadores());

        Acomodadores acomodador = new Acomodadores("adrian",26);
        acomodador.setSala(sala01);
        acomodador.setSueldo(50000);
        System.out.println("**Acomodadores**");
        System.out.println(acomodador.toString());

        Empleados empleado = new Empleados("Pedro",30);
        empleado.setSueldo(20000);
        System.out.println("**Empleados**");
        System.out.println(empleado.toString());
    }


}
