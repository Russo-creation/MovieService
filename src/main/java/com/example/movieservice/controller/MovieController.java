package com.example.movieservice.controller;

import com.example.movieservice.model.Movie;
import com.example.movieservice.model.MovieEnumCategory;
import com.example.movieservice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // 3b
//    @GetMapping
//    public ResponseEntity<List<Movie>> getMovieList(){
//        return ResponseEntity.ok(movieService());
//    }

    // 3c
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

//    // 3d
//    @PostMapping
//    public ResponseEntity<Movie> addMovie(@RequestBody Movie newMovie) {
//        Movie movie = new Movie(4L, "Matrix", MovieEnumCategory.SCI_FI);
//        return ResponseEntity.ok(movie);
//    }
//
//    // 3e
//    @PutMapping("/{movieId}")
//    public ResponseEntity<Movie> editMovie(@PathVariable Integer movieId) {
//        Movie movie = new Movie(4L, "Matrix", MovieEnumCategory.SCI_FI);
//        return ResponseEntity.ok(movie);
//    }
//
//    // 3f
//    @DeleteMapping("/{movieId}")
//    public ResponseEntity<Void> deleteMovie(@PathVariable Integer movieId) {
//        return ResponseEntity.ok().build();
//    }
}
