package com.platzi.javatests.util._test_negocio.data;

import com.platzi.javatests.util._test_negocio.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
