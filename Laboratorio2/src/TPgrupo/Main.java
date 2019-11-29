package TPgrupo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 29/11/2019.
 */
class Main {
    public static void main(String[]args){
        Circulo circulo = new Circulo(20);
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(30,50);

        System.out.println("test de circulo:");
        System.out.println(circulo.toString());
        System.out.println("area del circulo: "+circulo.getArea());
        System.out.println("perimetro del circulo: "+circulo.getPerimetro());
        System.out.println();
        System.out.println("test de cuadrado:");
        System.out.println(cuadrado.toString());
        System.out.println();
        System.out.println("test de rectangulo:");
        System.out.println(rectangulo.toString());
        System.out.println("area del rectangulo:"+rectangulo.getArea());
        System.out.println("perimetro del rectangulo:"+rectangulo.getPerimetro());
    }

    /*test de creacion de circulos y buffer de Scanner

    */
    public static Circulo[] crear(){
        Circulo[] circulos  = new Circulo[3];
        for(int i=0;i<circulos.length;i++) {
            System.out.println("valor para el radio del circulo nº"+i+":");
            try {
                Scanner teclado = new Scanner(System.in);

                circulos[i].setRadio(teclado.nextDouble());
            }catch(Exception e){
                System.out.println("error");
                System.exit(0);
            }
        }
        return circulos;
    }

}
