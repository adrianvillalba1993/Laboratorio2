package TPN9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 10/10/2019.
 */
public class Numeros implements Operaciones{
    private Integer[] arreglo;


    public Numeros(int cantidad){
        arreglo = new Integer[cantidad];
    }

    public void agregar(){
        System.out.println("agregar valores:");
        Scanner teclado = new Scanner(System.in);
        try {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = new Integer(teclado.nextInt());
            }
            teclado.close();
        }catch(InputMismatchException e){
            System.exit(0);
        }
    }

    public Integer[] getArreglo(){
        return arreglo;
    }

    public void listaNaturales(){
        Arrays.sort(arreglo);
        for (int i =0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" , ");
        }

    }

    @Override
    public void sumar(){
         int m = (int)(Math.random()*arreglo.length);
         int n = (int)(Math.random()*arreglo.length);
         int resu =0;

         resu = arreglo[m].intValue() + arreglo[n].intValue();
        System.out.println("resultado de sumar "+arreglo[m].intValue()
        +" + "+arreglo[n].intValue()+" = "+resu);
    }

    @Override
    public void restar(){
        int m = (int)(Math.random()*arreglo.length);
        int n = (int)(Math.random()*arreglo.length);
        int resu =0;

        resu = arreglo[m].intValue() - arreglo[n].intValue();
        System.out.println("resultado de restar "+arreglo[m].intValue()
                +" - "+arreglo[n].intValue()+" = "+resu);
    }

    @Override
    public void multiplicar(){
        int m = (int)(Math.random()*arreglo.length);
        int n = (int)(Math.random()*arreglo.length);
        int resu =0;

        resu = arreglo[m].intValue() * arreglo[n].intValue();
        System.out.println("resultado de multiplicar "+arreglo[m].intValue()
                +" x "+arreglo[n].intValue()+" = "+resu);
    }




}
