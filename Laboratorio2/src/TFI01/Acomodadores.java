package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private Salas salas;

    public Acomodadores(String nombre , int edad){
    super(nombre,edad);
    }

    public void setSala(Salas salas){
        this.salas = salas;
    }

    public String getTipo(){
        return "Acomodador";
    }

    public Salas getSala() {
        return salas;
    }
}
