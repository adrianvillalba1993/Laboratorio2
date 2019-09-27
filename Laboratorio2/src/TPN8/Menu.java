package TPN8;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adrian on 27/09/2019.
 */
public class Menu {
    private int opcion;
    private int contMoto;
    private int contCoche;
    ArrayList<Vehiculo> lista = new ArrayList<>();


    public Menu(){
        opcion = 0;
        contCoche=0;
        contMoto=0;
    }

    public void menu(){
        System.out.println("1)-Crear moto");
        System.out.println("2)-Crear coche");
        System.out.println("3)-Listar");
        System.out.println("4)-Salir");
        Scanner teclado = new Scanner(System.in);

        try{
           opcion = teclado.nextInt();
        }catch (InputMismatchException e){
            menu();
        }
        switch(opcion){
            case 1:
             lista.add(new Moto(crear()));
                System.out.println("El vehiculo acelera:");
             lista.get(contMoto).acelerar(velocidad());
                System.out.println("El vehiculo desacelera:");
             lista.get(contMoto).desacelerar(velocidad());

             contMoto++;
             menu();
             break;
            case 2:
                lista.add(new Coche(crear()));
                System.out.println("El vehiculo acelera:");
                lista.get(contCoche).acelerar(velocidad());
                System.out.println("El vehiculo desacelera:");
                lista.get(contCoche).desacelerar(velocidad());

                contCoche++;
                menu();
                break;
            case 3:
                for (int i=0;i<lista.size();i++){
                    lista.get(i).mensaje();
                }
            case 4:
                teclado.close();
                System.exit(0);
            default:
                menu();
                break;
        }
    }

    public int velocidad(){
        int velocidad=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("valor de velocidad:");
        try{
            velocidad = scan.nextInt();
        }catch (InputMismatchException e){
            velocidad();
        }
        return velocidad;
    }

    public int crear(){
        int inicial = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("velocidad inicial:");
        try{
            inicial = scan.nextInt();
        }catch (InputMismatchException e){
            crear();
        }

        return inicial;
    }


}
