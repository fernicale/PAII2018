package modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Experto extends Persona {
    
    private String area;
    private List<Reclamo> reclamosPendientes, reclamosFinalizados;

    public Experto(String area, String nombre, String apellido, String dni, String cuil, String telefono) {
        super(nombre, apellido, dni, cuil, telefono);
        this.area = area;
        this.reclamosPendientes = new ArrayList<>();
        this.reclamosFinalizados = new ArrayList<>();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Reclamo> getReclamosPendientes() {
        return reclamosPendientes;
    }

    public void setReclamosPendientes(List<Reclamo> reclamosPendientes) {
        this.reclamosPendientes = reclamosPendientes;
    }

    public List<Reclamo> getReclamosFinalizados() {
        return reclamosFinalizados;
    }

    public void setReclamosFinalizados(List<Reclamo> reclamosFinalizados) {
        this.reclamosFinalizados = reclamosFinalizados;
    }
    
}
