package TPN8;

/**
 * Created by adrian on 27/09/2019.
 */
public interface Vehiculo {
    int velocidad_maxima =120;

    void acelerar(int velocidad);
    void frenar();
    void desacelerar(int velocidad);
    int plazas();
    void mensaje();
}
