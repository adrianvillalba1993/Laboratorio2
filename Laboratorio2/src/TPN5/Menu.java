package TPN5;

import java.util.Scanner;

/**
 * Created by adrian on 22/08/2019.
 */
public class Menu {
    private int valor;
    private CuentaCorriente[] cuenta;

    public Menu() {
     valor =0;
     cuenta = new CuentaCorriente[10];
    }
    public void opcion(CuentaCorriente[] cuenta){
        int opcion;
        int valor =0;
        double monto=0 , monto2=0;
        System.out.println("1-crear cuenta\n2-elegir cuenta\n3-ingresar dinero\n4-retirar dinero\n5-devolver dinero a cuenta\n6-transferir dinero a otra cuenta\n7-mostrar\n8-salir");
        Scanner teclado = new Scanner(System.in);
        System.out.println("elegir una opcion:");
        boolean item = teclado.nextInt();
        if(item){
        opcion = teclado.nextInt();
        }else{
        opcion = 0;
        }
        switch(opcion){
            case 1:
                    if (cuenta[this.valor] == null) {
                        cuenta[this.valor] = crear();
                    }else{
                        System.out.println("la posicion esta ocupada por otra cuenta");
                    }
                opcion(cuenta);
                break;
            case 2:
                System.out.println("elegir cuenta:");
                valor = teclado.nextInt();
                this.valor = valor;
                opcion(cuenta);
                break;
            case 3:
                System.out.println("monto a ingresar:");
                monto = teclado.nextDouble();
                cuenta[this.valor].ingresarDinero(monto);
                opcion(cuenta);
                break;
            case 4:
                System.out.println("monto a retirar");
                monto = teclado.nextDouble();
                cuenta[this.valor].retirarDinero(monto);
                opcion(cuenta);
                break;
            case 5:
                System.out.println("dinero devuelto a la cuenta");
                cuenta[this.valor].devolver();
                opcion(cuenta);
                break;
            case 6:
                System.out.println("elegir la cuenta que transfiere el monto:");
                this.valor = teclado.nextInt();
                System.out.println("elegir la cuenta a la que se transfiere el monto");
                valor = teclado.nextInt();
                System.out.println("elegir monto a transferir:");
                monto = teclado.nextDouble();
                cuenta[valor].transferir(cuenta[this.valor],monto);
                opcion(cuenta);
                break;
            case 7:
                if(cuenta[this.valor] != null) {
                    mostrar(cuenta[this.valor]);
                }else{
                    System.out.println("esta posicion esta vacia");
                }
                opcion(cuenta);
                break;
            case 8:
                System.out.println("ha decidido cerrar el programa");
                System.exit(0);
                break;
            default:
                System.out.println("error:valor ingresado incorrecto");
                opcion(cuenta);
                break;
}
    }
    public void mostrar(CuentaCorriente cuenta){
        System.out.println(cuenta.toString());
    }

    public CuentaCorriente crear(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar nombre:");
        String nombre = teclado.nextLine();
        System.out.println("ingresar saldo inicial:");
        double saldo = teclado.nextDouble();
        CuentaCorriente arreglo = new CuentaCorriente(nombre,saldo);

        return arreglo;
    }
}

