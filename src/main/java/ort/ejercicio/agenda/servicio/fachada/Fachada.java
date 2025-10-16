package ort.ejercicio.agenda.servicio.fachada;

import ort.ejercicio.agenda.modelo.Usuario;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }
    
}
