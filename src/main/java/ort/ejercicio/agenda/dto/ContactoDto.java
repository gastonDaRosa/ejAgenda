package ort.ejercicio.agenda.dto;

import java.util.ArrayList;
import java.util.List;

import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.TipoContacto;

public class ContactoDto {
    private String nombre;
    private String tel; 
    private TipoContacto tipo;

    public ContactoDto(Contacto c){
        this.nombre = c.getNombre();
        this.tel = c.getTel();
        this.tipo = c.getTipo();
    }

    public static List<ContactoDto> listaDtos(List<Contacto> lista){
        List<ContactoDto> dtos = new ArrayList<>();
        for(Contacto c: lista){
           dtos.add(new ContactoDto(c));
        }
        return dtos;
    }


}
