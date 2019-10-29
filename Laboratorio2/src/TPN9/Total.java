package TPN9;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by adrian on 10/10/2019.
 */
public class Total {
    Integer[] array;

    public Total(Integer[] arreglo){
        for (int i=0;i<arreglo.length;i++){
            array[i] = arreglo[i];
        }
    }

    public void totalNaturales(){
        int n=0;
        for (int i =0;i<array.length;i++){
            n = n+array[i];
        }
        System.out.println("valor total de los numeros naturales es de "+n);
    }

    public void listaNaturales(){
        Arrays.sort(array);
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }

    }
}
