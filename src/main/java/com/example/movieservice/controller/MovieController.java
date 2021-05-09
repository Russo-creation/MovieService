package com.example.movieservice.controller;

import com.example.movieservice.movie.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> getMovieList(){
        List<Movie> movieList = new ArrayList<>();
        return ResponseEntity.ok(movieList);

//        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }
}
