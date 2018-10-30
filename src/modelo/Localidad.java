package modelo;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Chigal, Lautaro - Ferrazuolo, Nicolas
 */

public class Localidad {
    
    private String nombre;
    private SortedSet<String> direcciones;

    public Localidad(String nombre, SortedSet<String> direcciones) {
        this.nombre = nombre;
        this.direcciones = new TreeSet<>();
    }
    
}
