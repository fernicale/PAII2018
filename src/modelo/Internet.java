package modelo;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas - asdasdasd
 */

public class Internet extends Servicio {
    
    private int velocidad;
    private String tipo;

    public Internet(int velocidad, String tipo, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
