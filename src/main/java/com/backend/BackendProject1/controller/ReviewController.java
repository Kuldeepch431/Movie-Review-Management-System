package com.backend.BackendProject1.controller;


import com.backend.BackendProject1.domain.Review;
import com.backend.BackendProject1.service.ReviewService;
import com.backend.BackendProject1.service.request.ReviewRequest;
import com.backend.BackendProject1.service.response.ReviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewRequest reviewRequest){
        reviewService.addReview(reviewRequest.toReview());
    }
    /*
   POST:  localhost:8080/review/add
   {
    "movieId":"4",
    "movieReview" :"It was good enough",
    "rating":"10"
   }
     */

    @GetMapping("/find")
    public ReviewResponse getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
    /*
   GET: localhost:8080/review/find?reviewId=52
     */
}