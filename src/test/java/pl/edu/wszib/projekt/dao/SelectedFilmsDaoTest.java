package pl.edu.wszib.projekt.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.wszib.projekt.films.SelectedFilm;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectedFilmsDaoTest {

    public static final String WybranyFilm1 = "film1";
    public static final String WybranyFilm2 = "film2";

    @Autowired
    SelectedFilmsDao selectedFilmsDao;

    @Before
    public void setUp() throws Exception {


            SelectedFilm film1 = new SelectedFilm(WybranyFilm1, new Date());
            SelectedFilm film2 = new SelectedFilm(WybranyFilm2, new Date());

            assertNull(film1.getId());
            assertNull(film2.getId());

            selectedFilmsDao.save(film1);
            selectedFilmsDao.save(film2);
            System.out.println("----------------------------");
            assertNotNull(film1.getId());
            assertNotNull(film2.getId());

        }

        @Test
        public void testPobierzWszystkieDane () {

            Iterable<SelectedFilm> wybranyFilms = selectedFilmsDao.findAll();
            int counter = 0;
            for (SelectedFilm selectedFilm : wybranyFilms) {
                counter++;
            }

            assertTrue(counter >= 2);
        }
    @Test
    public void testFindFilm() {
        List<SelectedFilm> selectedFilms = selectedFilmsDao.findByFilm(WybranyFilm1);
        System.out.println("--------------------------------");
        assertEquals(WybranyFilm1, selectedFilms.get(0).getFilm());


    }

}






