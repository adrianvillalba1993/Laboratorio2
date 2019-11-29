package TPgrupo;

/**
 * Created by adrian on 29/11/2019.
 */
class Rectangulo extends Forma{
    private double alto;
    private double ancho;

    public Rectangulo(){

    }

    public Rectangulo(double alto , double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(double alto ,double ancho , String color,boolean lleno){
       super(color,lleno);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return alto*ancho;
    }

    @Override
    public double getPerimetro() {
        return 2*(alto+ancho);
    }

    @Override
    public String toString() {
        return "alto: "+alto+" y ancho: "+ancho;
    }
}
