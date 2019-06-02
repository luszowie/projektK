package pl.edu.wszib.projekt.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.wszib.projekt.filmy.WybranyFilm;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WybranyWybranyFilmDaoTest {

    public static final String WybranyFilm1 = "film1";
    public static final String WybranyFilm2 = "film2";

    @Autowired
    WybranyFilmDao wybranyFilmDao;

    @Before
    public void setUp() throws Exception {


            WybranyFilm film1 = new WybranyFilm(WybranyFilm1, new Date());
            WybranyFilm film2 = new WybranyFilm(WybranyFilm2, new Date());

            assertNull(film1.getId());
            assertNull(film2.getId());

            wybranyFilmDao.save(film1);
            wybranyFilmDao.save(film2);
            System.out.println("----------------------------");
            assertNotNull(film1.getId());
            assertNotNull(film2.getId());

        }

        @Test
        public void testPobierzWszystkieDane () {

            Iterable<WybranyFilm> wybranyFilms = wybranyFilmDao.findAll();
            int counter = 0;
            for (WybranyFilm wybranyFilm : wybranyFilms) {
                counter++;
            }

            assertTrue(counter >= 2);
        }
    @Test
    public void testFindFilm() {
        List<WybranyFilm> wybranyFilms = wybranyFilmDao.findByFilm(WybranyFilm1);
        System.out.println("--------------------------------");
        assertEquals(WybranyFilm1,wybranyFilms.get(0).getFilm());


    }

}






