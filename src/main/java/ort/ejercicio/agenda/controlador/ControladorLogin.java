package ort.ejercicio.agenda.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ort.ejercicio.agenda.modelo.Respuesta;
import ort.ejercicio.agenda.modelo.Usuario;
import ort.ejercicio.agenda.servicio.fachada.Fachada;


@RestController
@RequestMapping("/acceso")
public class ControladorLogin {
    
    @PostMapping("login")
    public List<Respuesta> login(HttpSession sesion, @RequestParam String usuario, @RequestParam String password) {
        
        Usuario usuarioLogueado = Fachada.getInstancia().login(usuario, password);
        sesion.setAttribute("usuarioLogueado", usuarioLogueado);

        return Respuesta.lista(new Respuesta("loginExitoso", "/usuario/agenda.html") );
    }
    
}
