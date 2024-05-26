package com.backend.BackendProject1.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.backend.BackendProject1.service.response.ReviewResponse;
import java.util.*;

import java.util.Date;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name="review_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Review {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)  // auto-increment is done by hibernate
    private Long id;

    private String movieReview;
    private double rating;  // rating dedicated to each review

    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false) // join the column by movie_id
    @JsonIgnore
    private Movie movie; // it will add foregion key in mysql table

    @CreationTimestamp
    private Date createdate;

    @UpdateTimestamp
    private Date updateDate;


    public static ReviewResponse toReviewResponse(Review review){
        return ReviewResponse.builder().review(review.movieReview).rating(review.rating).build();
    }

    public static List<ReviewResponse> toReviewResponse(List<Review> reviewList){
        if(Objects.isNull(reviewList))
            return new ArrayList<>();
        else
            return reviewList.stream().map(Review::toReviewResponse).collect(Collectors.toList());
    }

}
