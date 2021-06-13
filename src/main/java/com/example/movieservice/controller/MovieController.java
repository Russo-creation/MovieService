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

    @GetMapping
    public ResponseEntity<List<Movie>> getMovieList(){
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    ResponseEntity<Movie> createMovie (@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.createMovie(movie));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Movie> deleteMovie (@PathVariable Long id) {
        movieService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    ResponseEntity<Movie> updateMovie (@PathVariable Long id, @RequestBody Movie movie) {
        movieService.updateById(id, movie);
        return ResponseEntity.noContent().build();
    }

    //////////////////

    @PutMapping("/available_true/{id}")
    public ResponseEntity<Movie> setIsAvailableTrue(@PathVariable Long id) {
        movieService.updateByIdAvailable(id, true);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/available_false/{id}")
    public ResponseEntity<Movie> setIsAvailableFalse(@PathVariable Long id) {
        movieService.updateByIdAvailable(id, false);
        return ResponseEntity.noContent().build();
    }
}
