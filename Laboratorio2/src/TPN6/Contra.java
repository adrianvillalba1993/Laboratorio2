package TPN6;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by adrian on 07/09/2019.
 */
public class Contra {
    private int cantidad;
    private int largo;
    private String[] contra;
    private String resultado;

    public Contra(){
        //cantidad por defecto
        cantidad =3;
        largo = 6;
        resultado = "";
    }

    //la cantidad por defecto para que tamanio del arreglo no de 0
    public int tamanio(){
        return contra.length;
    }

    public void setCantidad(){
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("cantidad de contrasenias: ");
            cantidad = teclado.nextInt();
            if(cantidad > 0) {
                contra = new String[cantidad];
            }else{
                System.out.println("error");
                setCantidad();
            }
        }catch(InputMismatchException e){
            System.out.println("error: volver a intentar");
            setCantidad();
        }
    }

    public void setLargo(){
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Largo de las contraseñas: ");
            largo = teclado.nextInt();
            if(largo < 1){
                System.out.println("error");
                setLargo();
            }

        }catch(InputMismatchException e){
            System.out.println("error: volver a intentar");
            setLargo();
        }
    }

    public void generar() {
        String caraMayu = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String caraMinu = "abcdefghijklmnñopqrstuvwxyz";
        String numero = "0123456789";
        for(int i =0;i<cantidad;i++) {
           for (int j = 0; j < largo; j++) {
                this.resultado = generarInterno(this.resultado, caraMayu);
                this.resultado = generarInterno(this.resultado, caraMinu);
                this.resultado = generarInterno(this.resultado, numero);
               if(resultado.length() == largo){
                   break;
               }
           }
            contra[i] = resultado;
            resultado ="";
        }
    }

     private String generarInterno(String resultado,String palabra){
         String[] arreglo = palabra.split("");
         int random;
             random = (int) (Math.random() * arreglo.length);
             resultado = resultado + arreglo[random];

         return resultado;
    }
    //no pude hacer la verificacion de los numeros
    public void seguridad() {
        int mayu = 0;
        int minu = 0;
        /*
        int num = 0;
        int k =0;
        String numero = "0123456789";
        */
        for (int i = 0; i < contra.length; i++) {
            for(int j = 0;j<largo;j++){
                if(contra[i].charAt(j) == contra[i].toUpperCase().charAt(j)){
                    mayu++;
                }else if(contra[i].charAt(j) == contra[i].toLowerCase().charAt(j)){
                    minu++;
                }else{

                }

                /*else if(contra[i].charAt(k) == numero.charAt(j)){
                    num++;
                    k++;
                } */
            }
                 if(mayu > 2 && minu > 1 /*&& num > 5 */){
                     System.out.println("la contraseña "+contra[i]+" de "+largo+" caracteres es segura");
                 }else{
                     System.out.println("la contraseña "+contra[i]+" de "+largo+" caracteres no es segura");
                 }

                 mayu =0;
                 minu =0;

        }

    }

}
