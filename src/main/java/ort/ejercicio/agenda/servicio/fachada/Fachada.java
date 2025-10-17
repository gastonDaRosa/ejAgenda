package ort.ejercicio.agenda.servicio.fachada;

import java.util.ArrayList;
import java.util.List;

import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.TipoContacto;
import ort.ejercicio.agenda.modelo.Usuario;
import ort.ejercicio.agenda.servicio.ServicioAgenda;
import ort.ejercicio.agenda.servicio.ServicioUsuario;

public class Fachada {

    private static Fachada instancia;

    public static Fachada getInstancia(){
        if(instancia == null){
            instancia = new Fachada();
        }
        return instancia;
    }

    private Fachada(){

    }

    public Usuario login(String usuario, String pass) {
        return ServicioUsuario.login(usuario, pass);
    }
    public boolean agregar(Usuario usu) {
        return ServicioUsuario.agregar(usu);
    }



    public boolean agregarTipoContacto(String descripcion) {
        return ServicioAgenda.agregarTipoContacto(descripcion);
    }    

    public boolean agregar(Contacto con) {
        return ServicioAgenda.agregar(con);
    }

    public ArrayList<Contacto> getContactos() {
        return ServicioAgenda.getContactos();
    }

    public ArrayList<TipoContacto> getTipoContactos() {
        return ServicioAgenda.getTipoContactos();
    }
    
}
