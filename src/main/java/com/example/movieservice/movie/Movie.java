package com.example.movieservice.movie;

public class Movie {
    private Long ID;
    private String name;
    private MovieEnum category;

    public Movie(Long ID, String name, MovieEnum category) {
        this.ID = ID;
        this.name = name;
        this.category = category;
    }

    public Movie() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
