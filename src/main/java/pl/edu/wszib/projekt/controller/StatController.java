package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.projekt.dao.SelectedFilmsDao;
import pl.edu.wszib.projekt.films.SelectedFilm;
import pl.edu.wszib.projekt.helper.FilmHelper;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class StatController {

    @Value("${app.header.stat}")
    private String title;

    @Autowired
    SelectedFilmsDao selectedFilmsDao;

    @GetMapping("/stat")
   public String stat(@PathVariable(required = false) String film, Model model){

       Iterable<SelectedFilm> selectedFilms = selectedFilmsDao.findAll();
        Collection<SelectedFilm> selectedFilmCollection = (Collection<SelectedFilm>) selectedFilms;

       Map<String, Long> dataMap = selectedFilmCollection.stream()
               .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting()));

        List<String> labels = FilmHelper.convertFilms(dataMap.keySet());

        model.addAttribute("title", title);
        model.addAttribute("dataMap", dataMap);
        model.addAttribute("labels", labels);

        return "stat";
    }
}


