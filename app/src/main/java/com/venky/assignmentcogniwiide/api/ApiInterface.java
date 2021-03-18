package com.venky.assignmentcogniwiide.api;
import com.venky.assignmentcogniwiide.model.ResponseMovie;

import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    @GET("movie/popular")
    Call<ResponseMovie> getMovies(@QueryMap Map<String, String> queryParameters);
}
