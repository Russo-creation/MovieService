package com.example.movieservice.service;

import com.example.movieservice.exception.MovieNotFoundException;
import com.example.movieservice.model.Movie;
import com.example.movieservice.model.MovieEnumCategory;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie findById(Long id){
        return movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
    }

    public Movie createMovie (Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteById (Long id) {
        try{
            movieRepository.deleteById(id);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateById (Long id, Movie movie) {
        try{
            Movie movieFromDb = movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
            movieFromDb.setName(movie.getName());
            movieFromDb.setCategory(movie.getCategory());

            movieRepository.save(movieFromDb);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateByIdAvailable (Long id, Boolean availability) {
        try{
            Movie movieFromDb = movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
            movieFromDb.setIsAvailable(availability);
            movieRepository.save(movieFromDb);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
