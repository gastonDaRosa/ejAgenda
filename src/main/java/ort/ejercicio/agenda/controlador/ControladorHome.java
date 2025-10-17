package ort.ejercicio.agenda.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHome {

    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
    
}
