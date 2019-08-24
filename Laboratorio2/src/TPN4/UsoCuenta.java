package TPN4;

/**
 * Created by adrian on 23/08/2019.
 */
public class UsoCuenta {
    public static void main(String[]args){
     CuentaCorriente cuenta1 = new CuentaCorriente("pablo",200);
     CuentaCorriente cuenta2 = new CuentaCorriente("pedro",200);

        System.out.println("datos de ambas cuentas:");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println();
        System.out.println("luego de una transferencia de cuenta 1 a cuenta 2:");
        cuenta1.transferir(cuenta1,cuenta2,200);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
