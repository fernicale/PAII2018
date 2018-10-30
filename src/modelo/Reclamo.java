package modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Reclamo {
    
    private int codigo;
    private String descrpicion, estado, clasificacion;
    private GregorianCalendar fechaYHora;

    public Reclamo(int codigo, String descrpicion, String estado, String clasificacion, GregorianCalendar fechaYHora) {
        this.codigo = codigo;
        this.descrpicion = descrpicion;
        this.estado = estado;
        this.clasificacion = clasificacion;
        this.fechaYHora = fechaYHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrpicion() {
        return descrpicion;
    }

    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public GregorianCalendar getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(GregorianCalendar fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
}
