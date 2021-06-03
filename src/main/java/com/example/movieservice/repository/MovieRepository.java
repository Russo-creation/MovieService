package com.example.movieservice.repository;

import com.example.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
//   List<Movie> findById(Movie movie);

    @Override
    Optional<Movie> findById(Long aLong);

}
