package com.example.moviesAsessemnt;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResultPage {

    @JsonProperty("results")
    List<Movie> movies;

    public ResultPage() {
    }

    public ResultPage(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "ResultPage{" +
                "movies=" + movies +
                '}';
    }
}
