package TPgrupo;

/**
 * Created by adrian on 29/11/2019.
 */
abstract class Forma {
    protected String color;
    protected boolean lleno;
    public Forma(){

    }

    public Forma(String color,boolean lleno){
        this.color = color;
        this.lleno = lleno;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean estaLleno() {
        return lleno;
    }

    public void llenar(boolean lleno) {
        this.lleno = lleno;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract String toString();


}
