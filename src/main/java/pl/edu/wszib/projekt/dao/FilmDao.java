package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.filmy.Film;

import java.util.List;
@Repository
public interface FilmDao extends CrudRepository<Film, Integer> {
    List<Film> findByTytul (String tytul);



}
