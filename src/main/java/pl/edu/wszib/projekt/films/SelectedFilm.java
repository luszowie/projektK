package pl.edu.wszib.projekt.films;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lista_filmow")

public class SelectedFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String film;
    private Date ctime;

    public SelectedFilm() {

    }

    public SelectedFilm(String film, Date ctime) {
        this.film = film;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
