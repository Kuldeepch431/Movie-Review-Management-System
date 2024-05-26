package com.backend.BackendProject1.repository;

import com.backend.BackendProject1.domain.Genre;
import com.backend.BackendProject1.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    public Movie findByTitle(String title);

    public List<Movie> findByGenre(Genre genre);

}