package TPN6Rehecho;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 21/09/2019.
 */
public class Main {
    public static void main(String[]args){
     ingresar_datos();

    }

    public static void ingresar_datos(){
        int tamanio =0;
        int largo =0;
        System.out.println("cantidad de contrasenias:");
        Scanner teclado= new Scanner(System.in);
        try {

                tamanio = teclado.nextInt();
                System.out.println("ingresar largo de las contrasenias: ");
                largo = teclado.nextInt();
                if(tamanio < 0 || largo < 0){
                    teclado.close();
                    ingresar_datos();
                }
                Contra nueva = new Contra(tamanio, largo);
                nueva.generar();
                nueva.seguridad();
                teclado.close();

        }catch(InputMismatchException e){
            ingresar_datos();
        }
    }
}
