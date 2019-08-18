package TPN2;
import java.util.Scanner;

/**
 * Created by adrian on 15/08/2019.
 */
public class ejercicio2 {
    public static void main(String[]args){
    ejercicio2();
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

    public static void ejercicio2(){
        int[] arreglo = cargar();
        int acum = 0;
        float resu = 0;
        for(int i=0;i<arreglo.length;i++){
            if(i%2==0 && i != 0) {
                System.out.println("toma el valor "+i);
                resu++;
                acum = acum + arreglo[i];
            }
        }
        resu = acum/resu;
        System.out.println("la media de esos valores es "+resu);
    }
}
