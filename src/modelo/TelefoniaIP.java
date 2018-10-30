package modelo;

import java.util.Set;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class TelefoniaIP extends Servicio {
    
    private boolean nacional, internacional;
    private Set<String> numeros;

    public TelefoniaIP(boolean nacional, boolean internacional, Set<String> numeros, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.nacional = nacional;
        this.internacional = internacional;
        this.numeros = numeros;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public Set<String> getNumeros() {
        return numeros;
    }

    public void setNumeros(Set<String> numeros) {
        this.numeros = numeros;
    }
    
}
