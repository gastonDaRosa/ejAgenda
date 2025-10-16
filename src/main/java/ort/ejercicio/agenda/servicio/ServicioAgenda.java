package ort.ejercicio.agenda.servicio;

public class ServicioAgenda {

    private static ServicioAgenda instancia;

    public static ServicioAgenda getInstancia() {
        if(instancia == null){
            instancia = new ServicioAgenda();
        }
        return instancia;

    }

    private ServicioAgenda(){

    }


    
}
