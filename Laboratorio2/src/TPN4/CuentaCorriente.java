package TPN4;

import java.util.Random;

/**
 * Created by adrian on 23/08/2019.
 */
public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular,double saldo){
     this.nombreTitular = nombreTitular;
     this.saldo = saldo;
        Random random = new Random(System.nanoTime());
        numeroCuenta = random.nextInt(1000000);
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto){
        if(monto<=saldo){
            saldo -=monto;
        }else{
            System.out.println("error: monto a retirar excede el monto total de la cuenta");
        }
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Override
    public String toString(){
        return "nombre del titular: "+nombreTitular+", saldo:"+saldo;
    }

    public void transferir(CuentaCorriente cuenta1,CuentaCorriente cuenta2,double monto){
        if(monto<=cuenta1.getSaldo()){
            cuenta1.retirar(monto);
            cuenta2.ingresar(monto);
        }else{
            System.out.println("error: monto a retirar excede el monto total de la cuenta");
        }
    }
}
