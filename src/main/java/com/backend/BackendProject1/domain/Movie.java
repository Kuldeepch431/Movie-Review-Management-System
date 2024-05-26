package com.backend.BackendProject1.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.io.Serializable;
import com.backend.BackendProject1.service.response.MovieResponse;

@Entity
@Table(name="movie_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Movie implements Serializable {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING) // indicates that the enum value should be stored as a string in the database
    private Genre genre;

    private Double rating; // single entity which is average rating of all reviews for a movie

    @OneToMany(mappedBy = "movie") // one movie has many reviews
    private List<Review> reviews;

    public MovieResponse toMovieResponse(){
         return MovieResponse.builder().genre(this.genre).title(this.title).rating(this.rating).build();
    }
}
