package TPgrupo;

/**
 * Created by adrian on 29/11/2019.
 */
class Circulo extends Forma{
     private double radio;

    public Circulo(){

    }

    public Circulo(double radio){
      this.radio = radio;
    }

    public Circulo(double radio, String color ,boolean lleno){
        super(color,lleno);
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 3.14*(radio*radio);
    }

    @Override
    public double getPerimetro() {
        return 3.14*(2*radio);
    }

    @Override
    public String toString() {
        return "el radio del circulo: "+radio;
    }
}
