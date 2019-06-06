package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.projekt.dao.SelectedFilmsDao;
import pl.edu.wszib.projekt.films.SelectedFilm;

import java.util.Date;

@Controller
public class SelectedFilmsController {

   @Value("${app.header.select_film}")
    private String title;

    @Autowired
    SelectedFilmsDao selectedFilmsDao;

    @GetMapping({"/select", "/select/{film}"})
    public String SelectedfilmPage(@PathVariable(required = false) String film, Model model) {

        if (!StringUtils.isEmpty(film)) {
            selectedFilmsDao.save(new SelectedFilm(film, new Date()));
        }
        String [][] films = {{"Titanic", "Koszmar z ulicy Wiązów", "Oszukać przeznaczenie"},
        {"Avengers", "Krzyk", "Kogel mogel"}, {"Avatar", "Goonies", "Indiana Jones"}
        };

        model.addAttribute("title", title);
        model.addAttribute("films", films);
        return "select";
    }







}

