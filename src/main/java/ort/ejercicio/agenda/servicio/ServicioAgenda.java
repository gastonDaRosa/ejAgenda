package ort.ejercicio.agenda.servicio;

import java.util.ArrayList;

import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.TipoContacto;
import ort.ejercicio.agenda.modelo.Usuario;

public class ServicioAgenda {

    private static ArrayList<Contacto> contactos;
    private static ArrayList<TipoContacto> tipos;

    /*
    private static ServicioAgenda instancia;

    public static ServicioAgenda getInstancia() {
        if(instancia == null){
            instancia = new ServicioAgenda();
        }
        return instancia;

    }

    private ServicioAgenda(){

    }
    */

    //Contacto
    public static ArrayList<Contacto> getContactos(){
        return contactos;
    }
    public static boolean existeContacto(String nombre) {
           return buscarContacto(nombre)!=null;
    }
    public static Contacto buscarContacto(String nombre) {
           for(Contacto c:contactos){
               if(c.getNombre().equals(nombre)){
                   return c;
               }
           }
           return null;
    }
  
    public static boolean agregar(Contacto c){
        if(c==null) return false;
        boolean ok = false;
   
        if (!existeContacto(c.getNombre())){
            contactos.add(c);
            ok=true;
        }
        return ok;
    }

    public void setUsuario(Usuario usu){
        this.contactos = usu.getAgenda().getContactos();
    }


    //Tipo Contacto
    public static ArrayList<TipoContacto> getTipoContactos(){
        return tipos;
    }
    public static boolean agregarTipoContacto(String tipoNombre){
        if(tipoNombre==null) return false;
        boolean ok = false;
   

        if (!existeTipoContacto(tipoNombre)){
            TipoContacto tipo = new TipoContacto(tipoNombre);
            tipos.add(tipo);
            ok=true;
        }
        return ok;
    }
    public static boolean existeTipoContacto(String nombre) {
           return buscarTipoContacto(nombre)!=null;
    }
    public static TipoContacto buscarTipoContacto(String nombre) {
           for(TipoContacto t:tipos){
               if(t.getDescripcion().equals(nombre)){
                   return t;
               }
           }
           return null;
    }





    
}
