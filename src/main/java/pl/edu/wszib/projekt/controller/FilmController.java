package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {



    @GetMapping("/filmy")
    public String filmyPage() {
        return "filmy";
    }






}
