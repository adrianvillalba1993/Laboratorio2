package TFI01;

public class Empleados extends Personas{
    private double sueldo;

    public Empleados(String nombre , int edad){
   super(nombre,edad);


    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo(){

        return "Empleado";
    }

    @Override
    public String toString() {
        return " nombre: "+getNombre()+" , edad: "+getEdad()+" , sueldo: "+sueldo;
    }
}
