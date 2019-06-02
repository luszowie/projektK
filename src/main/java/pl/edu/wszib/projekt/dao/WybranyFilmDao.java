package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.filmy.WybranyFilm;

import java.util.List;
@Repository
public interface WybranyFilmDao extends CrudRepository<WybranyFilm, Integer> {
    List<WybranyFilm> findByFilm (String tytul);




}
