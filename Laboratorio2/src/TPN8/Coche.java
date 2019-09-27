package TPN8;

/**
 * Created by adrian on 27/09/2019.
 */
public class Coche implements Vehiculo{
    private int plaza;
    private int velocidad_inicial;
    private String modelo;

    public Coche(int velocidad_inicial){
        this.velocidad_inicial = velocidad_inicial;
        plaza = 5;
    }


    public void mensaje(){
        if(velocidad_inicial > 0) {
            System.out.println("coche que va a una velocidad de " + velocidad_inicial + "km/h");
        }else{
            System.out.println("coche que se encuentra quieto");
        }
        }

    @Override
    public void acelerar(int velocidad){
        this.velocidad_inicial = this.velocidad_inicial+velocidad;
        if(velocidad_inicial > velocidad_maxima){
            System.out.println("la velocidad maxima a sido superada");
        }
    }

    @Override
    public void frenar(){
        velocidad_inicial = 0;
        System.out.println("el vehiculo frenó");
    }

    @Override
    public void desacelerar(int velocidad){
        this.velocidad_inicial =this.velocidad_inicial - velocidad;
        if(velocidad_inicial <= 0){
            frenar();
        }
    }

    public int plazas(){
        return plaza;
    }
}
