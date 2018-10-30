package modelo;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Sistema {
    
    private final int version;
    private final String nombre, empresa, cuit, sucursal;

    public Sistema(int version, String nombre, String empresa, String cuit, String sucursal) {
        this.version = version;
        this.nombre = nombre;
        this.empresa = empresa;
        this.cuit = cuit;
        this.sucursal = sucursal;
    }
    
}
