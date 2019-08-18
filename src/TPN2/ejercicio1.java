package TPN2;
import java.util.Scanner;
/**
 * Created by adrian on 15/08/2019.
 */
public class ejercicio1 {
    public static void main(String[] args) {
        ejercicio1();
    }


    public static void ejercicio1(){
        int[] arreglo = cargar();
        int mayor=0;
        int menor=0;
        int cero=0;

        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i] < 0){
                menor++;
            }else if(arreglo[i] > 0){
                mayor++;
            }else if(arreglo[i] == 0){
                cero++;
            }
        }
        System.out.println("la cantidad de numeros positivos son "+mayor);
        System.out.println("la cantidad de numeros negativos son "+menor);
        System.out.println("la cantidad de numeros iguales a cero son "+cero);

    }



    public static int[] cargar(){
        int[] arreglo = new int[10];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("cargar valor:");
            Scanner teclado = new Scanner(System.in);
            arreglo[i] = teclado.nextInt();
        }
        return arreglo;
    }

}
