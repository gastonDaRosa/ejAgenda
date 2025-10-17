package ort.ejercicio.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ort.ejercicio.agenda.excepciones.AgendaException;
import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.TipoContacto;
import ort.ejercicio.agenda.modelo.Usuario;
import ort.ejercicio.agenda.servicio.ServicioUsuario;
import ort.ejercicio.agenda.servicio.fachada.Fachada;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) throws AgendaException {
		
		SpringApplication.run(AgendaApplication.class, args);
		cargarDatosDePrueba();
	}

	private static void cargarDatosDePrueba() throws AgendaException {
		// Datos de prueba
		TipoContacto particular = new TipoContacto("Particular");
		TipoContacto laboral = new TipoContacto("Laboral");
		TipoContacto familiar = new TipoContacto("Familiar");
		Fachada.getInstancia().agregarTipoContacto(particular.getDescripcion());	
		Fachada.getInstancia().agregarTipoContacto(laboral.getDescripcion());	
		Fachada.getInstancia().agregarTipoContacto(familiar.getDescripcion());	

		Usuario ana = new Usuario("a", "a", "Ana Perez");
		Usuario beatriz = new Usuario("b", "b","Beatriz Gomez");
		Usuario carlos = new Usuario("c", "c","Carlos Lopez");

		ana.getAgenda().agregar(new Contacto("Pedro", "1234-5678", familiar));
		ana.getAgenda().agregar(new Contacto("Maria", "8765-4321", laboral));
		beatriz.getAgenda().agregar(new Contacto("Luis", "1122-3344", particular));
		beatriz.getAgenda().agregar(new Contacto("Ana", "4433-2211", laboral));

		Fachada.getInstancia().agregar(ana);
		Fachada.getInstancia().agregar(beatriz);
		Fachada.getInstancia().agregar(carlos);



	}

}
