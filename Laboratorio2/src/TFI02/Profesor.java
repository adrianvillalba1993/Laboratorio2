package TFI02;

class Profesor extends Persona {
  private double sueldo;
  private int antiguedad;
    public Profesor(String nombre,String apellido,int legajo,int antiguedad,int sueldo){
     super(nombre,apellido,legajo);
     this.antiguedad = antiguedad;
     this.sueldo = sueldo;
    }

    public double calcularSueldo(){
     double valor=0;
     valor = (sueldo * 10);
     valor = valor / 100;
     valor = valor * antiguedad;
     valor = valor + sueldo;
     sueldo = valor;

      return sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos() {
       super.setNombre("adrian");
       super.setApellido("gonzales");
       super.setLegajo(223252);
       antiguedad = 5;
       sueldo = 20000;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "sueldo=" + sueldo +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
