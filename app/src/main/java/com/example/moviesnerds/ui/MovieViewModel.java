package com.example.moviesnerds.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesnerds.pojo.MovieModel;

public class MovieViewModel extends ViewModel {
//    LiveData<String> movieNameLiveData;
    MutableLiveData <String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        String movieName = getMovieFromDatabase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDatabase() {
        return new MovieModel("movie", "27-1", "hahha", 1);
    }
}
