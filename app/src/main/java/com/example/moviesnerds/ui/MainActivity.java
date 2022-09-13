package com.example.moviesnerds.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView movieText;
    Button movieBtn;
    MovieViewModel movieViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        movieBtn.setOnClickListener(this);

        movieViewModel = ViewModelProviders(this).get(MovieViewModel);
        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                movieText.setText(s);
            }
        });


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            movieViewModel.getMovieName();
        }
    }


}