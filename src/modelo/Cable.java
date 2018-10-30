package modelo;

import java.util.Set;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Cable extends Servicio {
    
    private int cantEquipos;
    private String tipo;
    private Set<String> paquetes;

    public Cable(int cantEquipos, String tipo, Set<String> paquetes, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.cantEquipos = cantEquipos;
        this.tipo = tipo;
        this.paquetes = paquetes;
    }

    public int getCantEquipos() {
        return cantEquipos;
    }

    public void setCantEquipos(int cantEquipos) {
        this.cantEquipos = cantEquipos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<String> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Set<String> paquetes) {
        this.paquetes = paquetes;
    }
    
}
