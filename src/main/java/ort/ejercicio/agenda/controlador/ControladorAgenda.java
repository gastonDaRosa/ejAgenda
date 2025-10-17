package ort.ejercicio.agenda.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ort.ejercicio.agenda.dto.ContactoDto;
import ort.ejercicio.agenda.modelo.Respuesta;
import ort.ejercicio.agenda.servicio.fachada.Fachada;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/agenda")
public class ControladorAgenda {

    @PostMapping("/vistaConectada")
    public List<Respuesta> vistaConectada() {
        return Respuesta.lista(contactos());
    }

    private Respuesta contactos() {
        
        return new Respuesta("contactos",
                      ContactoDto.listaDtos(Fachada.getInstancia().getContactos()));
        
    }
    
    
}
