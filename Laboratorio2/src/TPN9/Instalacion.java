package TPN9;

import java.util.Iterator;

/**
 * Created by adrian on 29/10/2019.
 */
public class Instalacion implements Iterator<Instalacion> {
    private String establecimiento;
    private double superficie;
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Instalacion next() {
        return null;
    }

    @Override
    public void remove() {

    }

}


