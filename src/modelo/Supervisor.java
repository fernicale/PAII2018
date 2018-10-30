package modelo;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Supervisor extends Persona {
    
    private String area;
    private double plus;

    public Supervisor(String area, double plus, String nombre, String apellido, String dni, String cuil, String telefono) {
        super(nombre, apellido, dni, cuil, telefono);
        this.area = area;
        this.plus = plus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }
    
}
