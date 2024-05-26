package com.backend.BackendProject1.service.response;


import com.backend.BackendProject1.domain.Genre;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieResponse {

    private String title;
    private Genre genre;
    private Double rating;
    private List<ReviewResponse> reviews;


}