package modelo;

import java.time.LocalTime;

/**
 *
 * @author Chigal, Lautaro - Ferrazzuolo
 */

public class Consulta {
    
    private LocalTime fechaYHora;

    public Consulta(LocalTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public LocalTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
}
