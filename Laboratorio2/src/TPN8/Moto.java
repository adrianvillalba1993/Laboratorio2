package TPN8;

import java.util.Scanner;

/**
 * Created by adrian on 27/09/2019.
 */
public class Moto implements Vehiculo{
    private int plaza;
    private int velocidad_inicial;
    private String modelo;
    public Moto(int velocidad_inicial){
        this.velocidad_inicial = velocidad_inicial;
        plaza = 2;
    }



    public void mensaje(){
        if(velocidad_inicial > 0) {
            System.out.println("moto que va a una velocidad de " + velocidad_inicial + "km/h");
        }else{
            System.out.println("moto que esta quieta");
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
    //ejercicio 3
    /*no entendí que es lo que queria el problema del ejercicio 3
    hice lo que creí entender pero no utilicé ese metodo.
     */
    public void frenarAlterno(){
        int frenodelantero =0;
        int frenotrasero =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("fuerza en el freno delantero:");
        frenodelantero =sc.nextInt();
        System.out.println("fuerza en el freno trasero:");
        frenotrasero = sc.nextInt();
        sc.close();
        velocidad_inicial = velocidad_inicial -(frenodelantero +frenotrasero);

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
