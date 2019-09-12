package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 07/09/2019.
 */
public class Ejercicio2 {
    public static void main(String[]args){
    ejercicio2();
    }

    public static void ejercicio2() throws Error{
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 100:");
        valor = teclado.nextInt();
        try {
            if (valor < 0 || valor > 100) {
                Error error = new Error("Error: el numero " + valor + " esta fuera de rango");
                throw error;
            } else {
                System.out.println("el numero ingresado fue " + valor);
            }
        }catch(InputMismatchException e){
            System.out.println("error:debe ingresar enteros");
            ejercicio2();
        }
    }

}


