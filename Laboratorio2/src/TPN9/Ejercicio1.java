package TPN9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 10/10/2019.
 */
public class Ejercicio1 {
    public static void main(String[]args){
        System.out.println("cantidad de numeros:");
        Scanner teclado = new Scanner(System.in);
        try {
            Numeros nuevo = new Numeros(teclado.nextInt());
            nuevo.agregar();
            nuevo.sumar();
            nuevo.multiplicar();
            nuevo.restar();
             nuevo.listaNaturales();
            //Total total = new Total(nuevo.getArreglo());
            //total.listaNaturales();
            //total.totalNaturales();
        }catch(InputMismatchException e){
            //el programa terminara
        }

    }
}
