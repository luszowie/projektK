/*package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.projekt.dao.SelectedFilmsDao;
import pl.edu.wszib.projekt.films.SelectedFilm;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class StatController {

    @Value("${app.header.stat}")
    private String title;

    @Autowired
    SelectedFilmsDao selectedFilmsDao;

    @GetMapping("/stat")
    public String stat() {

        Iterable<SelectedFilm> selectedFilms = selectedFilmsDao.findAll();
        Collection<SelectedFilm> selectedFilmCollection = (Collection<SelectedFilm>) selectedFilms;

        Map<String, Long> dataMap = selectedFilmCollection.stream()
                .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting()));
        //List<String> labels = FilmHelper.convertFilms(dataMap.keySet());

        //model.addAttribute("title", title);
        //model.addAtribute("selectedFilms", selectedFilms);

        return "stat";
    }

}*/
