package TPN5;

import java.util.Random;

/**
 * Created by adrian on 22/08/2019.
 */
public class CuentaCorriente {
    private String nombre;
    private double saldo;
    private long numCuenta;
    private double devolucion;

    public CuentaCorriente(String nombre,double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.devolucion = 0;
        Random nuevo = new Random(System.nanoTime());
        numCuenta = nuevo.nextInt(10);
    }

    public void ingresarDinero(double monto){
         this.saldo +=monto;
    }
    //retira el dinero o manda un mensaje de error si el valor a retirar > saldo cuenta
    public void retirarDinero(double monto){
         if(monto<=saldo){
             this.saldo-=monto;
             devolucion=monto;
         }else{
             System.out.println("error:monto a retirar es mayor a la cantidad en la cuenta");
         }
    }

    //devuelve el dinero que fue antes retirado a la cuenta
    public void devolver(){
        if(devolucion == 0){
            System.out.println("error: no fue retirado dinero o el valor ingresado fue cero");
        }
        ingresarDinero(devolucion);
    }

    public String getNombre() {
        return nombre;
    }

    //muestra todos los datos relevantes de la cuenta
    @Override
    public String toString(){
        return "nombre: "+nombre+", saldo: "+saldo+", Nºcuenta: "+numCuenta;
    }

    public CuentaCorriente transferir(CuentaCorriente cuenta ,double monto){
        if(monto <= saldo){
            cuenta.ingresarDinero(monto);
            saldo -= monto;
        }else{
            System.out.println("error: monto a retirar mayor a la cantidad de la cuenta");
        }
        return cuenta;
    }


}
