package ort.ejercicio.agenda.dto;

import java.util.ArrayList;
import java.util.List;

import ort.ejercicio.agenda.modelo.Contacto;
import ort.ejercicio.agenda.modelo.TipoContacto;

public class TipoContactoDto {
    private String descripcion;

    public TipoContactoDto(TipoContacto tp){
        this.descripcion = tp.getDescripcion();
    }

    public static List<TipoContactoDto> listaDtos(List<TipoContacto> lista){
        List<TipoContactoDto> dtos = new ArrayList<>();
        for(TipoContacto c: lista){
           dtos.add(new TipoContactoDto(c));
        }
        return dtos;
    }
    
}
