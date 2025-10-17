package ort.ejercicio.agenda.servicio;

import java.util.ArrayList;

import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.Usuario;

public class ServicioUsuario {

    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


    /*
    private static ServicioUsuario instancia;

    public static ServicioUsuario getInstancia(){
        if(instancia == null){
            instancia = new ServicioUsuario();
        }
        return instancia;
    }
    
    private ServicioUsuario (){

    }
    */


    public static Usuario login(String usuario, String pass) {
           return comprobarUsuario(usuario, pass);
    }
    public static Usuario comprobarUsuario(String usu, String pass) {
           for(Usuario u:usuarios){
               if(u.getUsuario().equals(usu) && u.contrsenaValida(pass)){
                   return u;
               }
           }
           return null;
    }

    public static boolean agregar(Usuario c){
        if(c==null) return false;
        boolean ok = false;
   
        if (!existeUsuario(c.getUsuario())){
            usuarios.add(c);
            ok=true;
        }
        return ok;
    }
    public static boolean existeUsuario(String nombre) {
           return buscarUsuario(nombre)!=null;
    }
    public static Usuario buscarUsuario(String nombre) {
           for(Usuario c:usuarios){
               if(c.getUsuario().equals(nombre)){
                   return c;
               }
           }
           return null;
    }



}
