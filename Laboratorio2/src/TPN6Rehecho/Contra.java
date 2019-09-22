package TPN6Rehecho;

import java.util.Random;

/**
 * Created by adrian on 21/09/2019.
 */
public class Contra {
    private int tamanio;
    private int largo;
    private String[] contras;

    public Contra(int tamanio ,int largo){
        this.tamanio = tamanio;
        this.largo = largo;
        contras = new String[largo];
    }

    //este generar no considera la letra 'Ñ'
     public void generar(){

        char[] numero = {'0','1','3','4','5','6','7','8','9','a','b'
                ,'c','d','e','f','g','h','i','j','k','l','m','n','o','p'
                ,'q','r','s','t','u','v','w','x','y','z','A','B','C','D','E'
                ,'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'
                ,'U','V','W','X','Y','Z'};
         String palabra = "";
         for(int j=0;j<tamanio;j++) {
             for (int i = 0; i < largo; i++) {
                 int random = (int) (Math.random() * numero.length);
                 palabra += numero[random];
             }
             contras[j] = palabra;

             palabra ="";
         }
    }
    //la verificacion se hace con la tabla ASCII
    public void seguridad(){
         int numeros =0;
         int mayuscula =0;
         int minusculas =0;
         for(int i=0;i<tamanio;i++){
             for(int j=0;j<largo;j++){
                 if((int)contras[i].charAt(j) > 47 && (int)contras[i].charAt(j) < 58){
                  numeros++;
                 }else if((int)contras[i].charAt(j) > 64 && (int)contras[i].charAt(j) < 91){
                     mayuscula++;
                 }else if((int)contras[i].charAt(j) > 96 && (int)contras[i].charAt(j) < 123){
                   minusculas++;
                 }
             }
             if(numeros > 5 && mayuscula > 2 && minusculas > 1){
                 System.out.println("la contraseña "+contras[i]+" de "+largo+" caracteres , es segura");
             }else{
                 System.out.println("la contraseña "+contras[i]+" de "+largo+" caracteres , no es segura");
             }
             System.out.println("numeros:"+numeros+", mayusculas:"+mayuscula+" ,minusculas:"+minusculas);
             numeros =0;
             mayuscula=0;
             minusculas=0;

         }

    }
}
