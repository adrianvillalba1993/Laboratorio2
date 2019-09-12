package TPN7;

/**
 * Created by adrian on 07/09/2019.
 */
public class Error extends RuntimeException{

    public Error(){

    }

    public Error(String mensaje){
        super(mensaje);
    }
}
