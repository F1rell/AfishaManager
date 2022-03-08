package manager;

import domain.Afisha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    private AfishaManager service = new AfishaManager();
    private Afisha film1 = new Afisha(1, "Бладшот", "боевик");
    private Afisha film2 = new Afisha(2, "Вперёд", "мультфильм");
    private Afisha film3 = new Afisha(3, "Белград", "комедия");
    private Afisha film4 = new Afisha(4, "Джентельмены", "боевик");
    private Afisha film5 = new Afisha(5, "Человек-невидимка", "ужасы");
    private Afisha film6 = new Afisha(6, "Тролли. Мировой тур", "мультфильм");
    private Afisha film7 = new Afisha(7, "Номер один", "комедия");
    private Afisha film8 = new Afisha(8, "Ледниковый период", "мультфильм");
    private Afisha film9 = new Afisha(9, "Форсаж", "Боевик");
    private Afisha film10 = new Afisha(10, "Маски-шоу", "комедия");
    private Afisha film11 = new Afisha(11, "Java", "ужасы");
    private Afisha film12 = new Afisha(12, "JavaScript", "Хоррор");

    @Test
    void add() {
        Afisha[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        service.add(film1);
        service.add(film2);
        service.add(film3);
        service.add(film4);
        service.add(film5);
        service.add(film6);
        service.add(film7);
        service.add(film8);
        service.add(film9);
        service.add(film10);
        assertArrayEquals(expected, service.findAll());
    }

    @Test
    void shouldFindLast() {
        AfishaManager afishaManager = new AfishaManager();
        Afisha[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        assertArrayEquals(expected, afishaManager.findLast());
    }

    @Test
    void shouldLastIfLimitDefault() {
        AfishaManager afishaManager = new AfishaManager();
        Afisha[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        afishaManager.add(film11);
        afishaManager.add(film12);
        assertArrayEquals(expected, afishaManager.findLast());
    }

    @Test
    void shouldLastIfEnterLimit() {
        AfishaManager afishaManager = new AfishaManager(5);
        Afisha[] expected = {film12, film11, film10, film9, film8};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        afishaManager.add(film11);
        afishaManager.add(film12);
        assertArrayEquals(expected, afishaManager.findLast());
    }
}