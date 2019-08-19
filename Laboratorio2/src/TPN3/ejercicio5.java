package TPN3;

import java.util.Scanner;

/**
 * Created by adrian on 17/08/2019.
 */
public class ejercicio5 {
    public static void main(String[]args){
        int[][] matriz =crear();
        System.out.println("sin ordenar");
        mostrar(matriz);
        System.out.println("ordenado");
        mostrar(ordernar(matriz));

    }

    public static void mostrar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] crear(){
        int[][] matriz = new int[3][3];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("ingrese el numero:");
                Scanner teclado = new Scanner(System.in);
                matriz[j][i] =teclado.nextInt();
            }
        }
        return matriz;
    }

    //no supe como hacerlo con logica propia , lo tuve que mirar en un libro
    public static int[][] ordernar(int[][] matriz){
        int temporal = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                for(int x=0;x<matriz.length;x++){
                    for(int y=0;y<matriz.length;y++){
                        if(matriz[i][j] < matriz[x][y]){
                            temporal = matriz[x][y];
                            matriz[x][y] = matriz[i][j];
                            matriz[i][j] = temporal;
                        }
                    }
                }
            }
        }
        return matriz;
    }
}
