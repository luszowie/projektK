package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.projekt.dao.SelectedFilmsDao;
import pl.edu.wszib.projekt.films.SelectedFilm;

@Controller
public class DataController {

    @Value("${app.header.data}")
    private String title;

    @Autowired
    SelectedFilmsDao selectedFilmsDao;

    @GetMapping("/data")
    public String DataPage (Model model) {
        Iterable<SelectedFilm> selectedFilms = selectedFilmsDao.findAll();

        model.addAttribute("title", title);
        model.addAttribute("selectedFilms", selectedFilms);

        return "data";
    }
}
