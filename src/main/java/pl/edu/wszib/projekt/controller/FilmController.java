package pl.edu.wszib.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {

    @GetMapping("/filmy")
    public String filmyPage() {
        return "filmy";
    }

    @GetMapping("/lista_filmow")
    public String listaPage() {
        return "lista_filmow";
    }

    @GetMapping("/lista_obejrzanych_filmow")
    public String obejrzanePage() {
        return "lista_obejrzanych_filmow";
    }




}
