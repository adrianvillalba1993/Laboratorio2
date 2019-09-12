package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 07/09/2019.
 */
public class Ejercicio3 {
    public static void main(String[]args) {
    ejercicio3();
    }

    public static void ejercicio3() {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar un valor:");
        try {
            valor = teclado.nextInt();
            if (valor % 2 == 0) {
                System.out.println("el numero ingresado es par");
            } else {
                System.out.println("el numero ingresado es impar");
            }
        } catch (InputMismatchException e) {
            System.out.println("error: debe ingresar numeros enteros");
           ejercicio3();
        }
    }

}