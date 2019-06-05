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

    //@GetMapping("/stat")
            //public String stat() {


       Iterable<SelectedFilm> selectedFilms = selectedFilmsDao.findAll();
        Collection<SelectedFilm> selectedFilmCollection = (Collection<SelectedFilm>) selectedFilms;

       Map<String, Long> dataMap = selectedFilmCollection.stream()
               .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting()));
     /* for(Map.Entry<String, Long> entry : dataMap.entrySet()){
            String filmy  = entry.getKey();
            Long sum = entry.getValue();
        }*/

        List<String> labels = FilmHelper.convertFilms(dataMap.keySet());




        model.addAttribute("title", title);
        model.addAttribute("dataMap", dataMap);
        model.addAttribute("labels", labels);

       // model.addAttribute("filmy",  filmy);
       //model.addAttribute("selectedFilms", selectedFilmCollection.stream().collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting())));
      // model.addAttribute("selectedFilms", selectedFilmCollection.stream()
             // .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting())));
        //model.addAttribute("dataMap", dataMap.entrySet());
        //model.addAttribute("selectedfilms", selectedFilmCollection.stream()
              //  .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting())));
        //model.addAttribute("data", selectedFilmCollection.stream()
             // .collect(Collectors.groupingBy(SelectedFilm::getFilm, Collectors.counting())));
        return "stat";
    }

}


