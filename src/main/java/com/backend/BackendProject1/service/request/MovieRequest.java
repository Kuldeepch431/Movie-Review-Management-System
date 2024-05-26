package com.backend.BackendProject1.service.request;


import com.backend.BackendProject1.domain.Genre;
import com.backend.BackendProject1.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {

    private String title;
    private Genre genre;

    public Movie toMovie(){
        return Movie.builder().title(title).genre(genre).rating(0.0).build();
    }


}