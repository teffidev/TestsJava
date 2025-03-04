package com.platzi.javatests.util._test_negocio.data;

import com.platzi.javatests.util._test_negocio.model.Genre;
import com.platzi.javatests.util._test_negocio.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    private MovieRepositoryJdbc movieRepository;
    private DataSource dataSource;

    @Before
    public void setUp() throws Exception {

        dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }


    @Test
    public void load_all_movies() {

        Collection<Movie> movies = movieRepository.findAll();

        assertThat(movies, is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "There's Something About Mary", 119, Genre.COMEDY)
        )));
    }

    @Test
    public void load_movie_by_id() {

        Movie movie = movieRepository.findById(2);

        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    public void insert_a_movie() {

        Movie movie = new Movie(4, "Super 8", 112, Genre.THRILLER);
        movieRepository.saveOrUpdate(movie);

        Movie movieFromDb = movieRepository.findById(4);
        assertThat( movieFromDb, is(movie) );

    }

    @After
    public void tearDown() throws Exception {
        //Remove H2 files -- https://stackoverflow.com/a/51809831//1121497
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files"); // "shutdown" is also enough for mem db


    }
}