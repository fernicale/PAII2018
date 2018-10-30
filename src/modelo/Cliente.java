package modelo;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Cliente extends Persona {
    
    private String numCliente;

    public Cliente(String numCliente, String nombre, String apellido, String dni, String cuil, String telefono) {
        super(nombre, apellido, dni, cuil, telefono);
        this.numCliente = numCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }
    
}
