package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.model.MovieEnumCategory;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private List<Movie> movieList = new ArrayList<>();

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findById(Long id){
        return movieRepository.findById(id);
    }

    public void createMovieList() {
        Movie movie1 = new Movie(1L, "Killing Engines", MovieEnumCategory.ANIME);
        movieList.add(movie1);
        Movie movie2 = new Movie(2L, "Django", MovieEnumCategory.SCI_FI);
        movieList.add(movie2);
        Movie movie3 = new Movie(3L, "Kill Bill", MovieEnumCategory.FANTASY);
        movieList.add(movie3);
    }

    public List<Movie> listMovies(){
        return movieList;
    }
}
