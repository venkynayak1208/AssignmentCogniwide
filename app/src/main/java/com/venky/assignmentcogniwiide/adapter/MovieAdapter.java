package com.venky.assignmentcogniwiide.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.venky.assignmentcogniwiide.R;
import com.venky.assignmentcogniwiide.databinding.MatchCalenderItemBinding;
import com.venky.assignmentcogniwiide.model.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Movie> movieList ;
    private Context context;

    public MovieAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MatchCalenderItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.match_calender_item, parent, false);
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        final Movie movie = movieList.get(position);
        holder.binding.setMovie(movie);
        holder.bind(movie);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        private MatchCalenderItemBinding binding;

        public MovieViewHolder(MatchCalenderItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.executePendingBindings();
        }
    }
}