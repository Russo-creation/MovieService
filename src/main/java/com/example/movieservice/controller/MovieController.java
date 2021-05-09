package com.example.movieservice.controller;

import com.example.movieservice.movie.Movie;
import com.example.movieservice.movie.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
        movieService.createMovieList();
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovieList(){
        return ResponseEntity.ok(movieService.listMovies());
    }
}
