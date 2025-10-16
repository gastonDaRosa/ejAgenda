package ort.ejercicio.agenda.modelo;

public class TipoContacto {
    //Particular, Laboral y Familiar
    private String descripcion;

    public TipoContacto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
