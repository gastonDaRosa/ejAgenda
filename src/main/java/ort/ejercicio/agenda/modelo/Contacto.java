package ort.ejercicio.agenda.modelo;

public class Contacto {
    private String nombre;
    private String tel; 
    private TipoContacto tipo;

    public Contacto(String nombre, String tel, TipoContacto tipo) {
        this.nombre = nombre;
        this.tel = tel;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public TipoContacto getTipo() {
        return tipo;
    }

    public void setTipo(TipoContacto tipo) {
        this.tipo = tipo;
    }

    
    
    
}
