package pl.edu.wszib.projekt.helper;

import pl.edu.wszib.projekt.films.SelectedFilm;
import javax.swing.text.html.StyleSheet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FilmHelper {
    public static List<String> convertFilms(Collection<String> strFilms) {
        StyleSheet styleSheet = new StyleSheet();

        List<String> films = new ArrayList<>();
        for (String strFilm : strFilms) {
            SelectedFilm film = new SelectedFilm();
            films.add("film");
        }
         return films;
        }
    }


