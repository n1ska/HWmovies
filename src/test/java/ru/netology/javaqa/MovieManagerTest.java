package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    void appendMovie() {
        MovieManager manager = new MovieManager();
        manager.appendMovie("Forest Gump");

        String[] actual = manager.findAll();
        String[] expected = new String[]{"Forest Gump"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getMoviesCount() {
        MovieManager manager = new MovieManager();
        manager.appendMovie("Forest Gump");

        int actual = manager.getMoviesCount();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        MovieManager manager = new MovieManager();
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");

        String[] actual = manager.findAll();
        String[] expected = new String[]{"Forest Gump", "Star Wars"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastDefault() {
        MovieManager manager = new MovieManager();
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");
        manager.appendMovie("Transformers: Rise of the Beasts");
        manager.appendMovie("Knowing");
        manager.appendMovie("The day after tomorrow");
        manager.appendMovie("Geostorm");
        manager.appendMovie("Spider-Man: Across the Spider-Verse");


        String[] actual = manager.findLast();
        String[] expected = new String[]{"Spider-Man: Across the Spider-Verse", "Geostorm",
                "The day after tomorrow", "Knowing", "Transformers: Rise of the Beasts"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastThreeMoviesWithFiveInArray() {
        MovieManager manager = new MovieManager(3);
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");
        manager.appendMovie("Transformers: Rise of the Beasts");
        manager.appendMovie("Knowing");
        manager.appendMovie("The day after tomorrow");
        manager.appendMovie("Geostorm");
        manager.appendMovie("Spider-Man: Across the Spider-Verse");


        String[] actual = manager.findLast();
        String[] expected = new String[]{"Spider-Man: Across the Spider-Verse", "Geostorm", "The day after tomorrow"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastWithNegativeWithSevenInArray() {
        MovieManager manager = new MovieManager(-1);
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");
        manager.appendMovie("Transformers: Rise of the Beasts");
        manager.appendMovie("Knowing");
        manager.appendMovie("The day after tomorrow");
        manager.appendMovie("Geostorm");
        manager.appendMovie("Spider-Man: Across the Spider-Verse");


        String[] actual = manager.findLast();
        String[] expected = new String[0];

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastFiveMoviesWithThreeInArray() {
        MovieManager manager = new MovieManager(5);
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");
        manager.appendMovie("Transformers: Rise of the Beasts");

        String[] actual = manager.findLast();
        String[] expected = new String[] {"Transformers: Rise of the Beasts", "Star Wars", "Forest Gump"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastThreeMoviesWithThreeInArray() {
        MovieManager manager = new MovieManager(3);
        manager.appendMovie("Forest Gump");
        manager.appendMovie("Star Wars");
        manager.appendMovie("Transformers: Rise of the Beasts");

        String[] actual = manager.findLast();
        String[] expected = new String[] {"Transformers: Rise of the Beasts", "Star Wars", "Forest Gump"};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void findLastFiveWithEmptyManager() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findLast();
        String[] expected = new String[0];

        Assertions.assertArrayEquals(expected, actual);
    }
}