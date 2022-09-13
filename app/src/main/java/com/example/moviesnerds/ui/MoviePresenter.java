package com.example.moviesnerds.ui;

import com.example.moviesnerds.pojo.MovieModel;

public class MoviePresenter {
    MovieView view ;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }
    public MovieModel getMovieFromDatabase() {
        return new MovieModel("movie", "27-1", "hahha", 1);
    }
    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
