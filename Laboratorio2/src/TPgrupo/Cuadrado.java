package TPgrupo;

/**
 * Created by adrian on 29/11/2019.
 */
class Cuadrado extends Rectangulo{
    private double lado;
    public Cuadrado(){

    }

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public Cuadrado(double lado,String color,boolean lleno){
        //super(color,lleno);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /*Lo pedia el ejercicio de codeForces que encontre
     supongo que es para demostrar que una clase hija podia
     reutilizar la firma de un metodo cambiando su cuerpo.
     */
    @Override
    public void setAlto(double alto) {
        setLado(alto);
    }

    @Override
    public void setAncho(double ancho) {
        setLado(ancho);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
