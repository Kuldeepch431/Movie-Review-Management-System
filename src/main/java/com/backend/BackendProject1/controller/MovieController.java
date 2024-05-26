package com.backend.BackendProject1.controller;


import com.backend.BackendProject1.service.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.backend.BackendProject1.service.MovieService;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/title")
    public MovieResponse findMovie(@RequestParam  String title){
        return movieService.findMovie(title);
    }
/*
GET : localhost:8080/movie/title?title=KGF
 */
    @GetMapping("/genre")
    public List<MovieResponse> findMovieByGenre(@RequestParam String genre){
        return movieService.findMoviesByGenre(genre);
    }
// GET : localhost:8080/movie/genre?genre=ACTION
}