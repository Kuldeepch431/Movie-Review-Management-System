package com.backend.BackendProject1.service;


import com.backend.BackendProject1.domain.Movie;
import com.backend.BackendProject1.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
}