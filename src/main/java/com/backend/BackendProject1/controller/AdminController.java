package com.backend.BackendProject1.controller;

import com.backend.BackendProject1.service.AdminService;
import com.backend.BackendProject1.service.request.MovieRequest;
import com.backend.BackendProject1.service.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("movie/add")
    public ResponseEntity<MovieResponse> addMovie(@RequestBody MovieRequest movieRequest){
        return new ResponseEntity<>(adminService.addMovie(movieRequest.toMovie()).toMovieResponse(), HttpStatus.CREATED);
    }
    /*
   POST: localhost:8080/admin/movie/add
   {
    "title" : "Salaar",
    "genre" : "ACTION"
    // rating will be 0 at initial it can be set only in review
}
     */
}
