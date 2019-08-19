package TPN3;
import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Created by adrian on 17/08/2019.
 */
public class ejercicio4 {
    public static void main(String[]args){
        int[][] matriz = crear();
        System.out.println("desordenado");
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
                matriz[j][i] = (int)(Math.random()*100);
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
