package ort.ejercicio.agenda.modelo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda(ArrayList contactos) {
        this.contactos = contactos;
    }

    public Agenda() {
        this.contactos = new ArrayList<Contacto>();
    }

    public void agregar (Contacto cont){
        this.contactos.add(cont);
    }

    public ArrayList<Contacto> getContactos(){
        return contactos;
    }

    
    
}
