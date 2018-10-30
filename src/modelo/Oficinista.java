package modelo;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo, Nicolas
 */

public class Oficinista extends Persona {
    
    private String codigo, area, cbu;
    private double sueldo;

    public Oficinista(String codigo, String area, String cbu, double sueldo, String nombre, String apellido, String dni, String cuil, String telefono) {
        super(nombre, apellido, dni, cuil, telefono);
        this.codigo = codigo;
        this.area = area;
        this.cbu = cbu;
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
