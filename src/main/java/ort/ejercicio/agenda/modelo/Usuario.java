package ort.ejercicio.agenda.modelo;

public class Usuario{
    private String usuario;
    private String contra;
    private String nombreCompleto;
    private Agenda agenda;

    public Usuario(String usuario, String contra, String nombreCompleto) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombreCompleto = nombreCompleto;
        this.agenda = new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    

    

}