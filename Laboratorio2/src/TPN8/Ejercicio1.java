package TPN8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 26/09/2019.
 */
/*tuve que agregar otro metodo llamado desacelerar , si el vehiculo llega a velocidad 0 o menor
 entonces llama a la funcion frenar donde envia un mensaje diciendo que el vehiculo a frenado.
  */
public class Ejercicio1 {
    public static void main(String[]args){
        crear();
    }

    public static void crear(){
        Scanner teclado = new Scanner(System.in);
        Vehiculo[] array = new Vehiculo[2];
        try{
            System.out.println("velocidad inicial coche:");
            int inicial =teclado.nextInt();
            array[0] = new Coche(inicial);
            System.out.println("velocidad inicial moto:");
            inicial = teclado.nextInt();
            array[1] = new Moto(inicial);
            teclado.close();
        }catch (InputMismatchException e){
            crear();
        }finally{

            array[0].acelerar(60);
            array[1].acelerar(200);
            array[0].desacelerar(500);
            array[1].desacelerar(10);
            System.out.println(array[0].plazas());
            System.out.println(array[1].plazas());

        }

    }

}
