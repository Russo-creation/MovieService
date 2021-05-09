package com.example.movieservice.sandbox;

import com.example.movieservice.movie.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class SandboxController {

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> getMovieList(){
        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }
}
