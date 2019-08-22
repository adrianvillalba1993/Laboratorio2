package TPN3;

/**
 * Created by adrian on 15/08/2019.
 */
public class ejercicio1 {
  public static void main(String[]args){
   ejercicio1();

  }

  public static int[] crear(){
      int[] arreglo = new int[100];

      for(int i=0;i<arreglo.length;i++){
          arreglo[i] = (int)(Math.random()*20);
      }
      return arreglo;
  }

  public static void ejercicio1(){
      int[] arreglo = crear();
      for(int elemento:arreglo){
          System.out.println(elemento+" ");
      }

      }
  }


