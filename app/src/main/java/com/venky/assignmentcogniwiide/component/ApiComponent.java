package com.venky.assignmentcogniwiide.component;


import com.venky.assignmentcogniwiide.module.ApiClientModule;
import com.venky.assignmentcogniwiide.module.AppModule;
import com.venky.assignmentcogniwiide.repository.MovieRepository;
import com.venky.assignmentcogniwiide.view.MovieActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiClientModule.class, AppModule.class})
public interface ApiComponent {
    void inject(MovieActivity movieActivity);
    void injectMovie(MovieRepository movieRepository);
}