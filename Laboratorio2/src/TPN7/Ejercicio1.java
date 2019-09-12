package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 07/09/2019.
 */
public class Ejercicio1 {
    public static void main(String[]args){
    ejercicio1();
    }

    public static void ejercicio1(){
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar un valor entero:");
        try{
            valor = teclado.nextInt();
            if(valor%2==0){
                System.out.println("el numero "+valor+" es par");
            }else{
                System.out.println("el numero "+valor+" es impar");
            }
        }catch (InputMismatchException e){
            System.out.println("error: debe ingresarse numeros enteros");
        }
    }
}
