package com.example.movieservice.service;

import com.example.movieservice.exception.MovieNotFoundException;
import com.example.movieservice.model.Movie;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie findById(Long id){
        return movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
    }

//    public Optional<Movie> findAllMovies(){
//        return movieRepository.getAll();
//    }

}
