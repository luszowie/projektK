package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.films.SelectedFilm;

import java.util.List;
@Repository
public interface SelectedFilmsDao extends CrudRepository<SelectedFilm, Integer> {
    List<SelectedFilm> findByFilm (String film);
}
