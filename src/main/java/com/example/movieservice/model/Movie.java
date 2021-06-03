package com.example.movieservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private MovieEnumCategory category;

    @Column(name="isAvailable")
    private Boolean isAvailable;

//    public Movie(Long id, String name, MovieEnumCategory category) {
//        this.id = id;
//        this.name = name;
//        this.category = category;
//    }

    public Movie() {

    }


    public Boolean getIsAvailable() {
        return isAvailable;
    }


    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieEnumCategory getCategory() {
        return category;
    }

    public void setCategory(MovieEnumCategory category) {
        this.category = category;
    }
}
