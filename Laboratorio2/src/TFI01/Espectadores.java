package TFI01;

public class Espectadores extends Personas{
    private String fila;
    private int  silla;

    public Espectadores(String nombre , int edad , String fila , int silla){
        super(nombre,edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String getTipo(){

        return "Espectador";
    }

    @Override
    public String toString(){
    return "nombre: "+getNombre()+", edad: "+getEdad()+", fila: "+fila+" , silla: "+silla;
    }

    public String getButaca(){
        return "la fila: "+fila+" silla: "+silla;
    }
}
