package TPN3;
import java.util.Scanner;

/**
 * Created by adrian on 17/08/2019.
 */
public class ejercicio3 {
    public static void main(String[]args){
        String[][] matriz = new String[3][3];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                Scanner teclado = new Scanner(System.in);
                if(j == 0){
                    System.out.println("ingrese nombre:");
                }else if(j == 1){
                    System.out.println("ingrese DNI:");
                }else if(j == 2){
                    System.out.println("ingrese edad:");
                }
                matriz[j][i] = teclado.nextLine();
            }
        }
        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
