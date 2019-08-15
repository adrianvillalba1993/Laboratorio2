package TPN3;

/**
 * Created by adrian on 15/08/2019.
 */
public class ejercicio2 {
    public static void main(String[]args){
       ejercicio2();
    }

    public static void ejercicio2(){
        int[][] matriz = new int[3][3];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j] =(int)(Math.random()*100);
            }
        }

        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

    }


}
