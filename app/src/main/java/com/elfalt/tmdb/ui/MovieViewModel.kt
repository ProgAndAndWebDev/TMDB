package com.elfalt.tmdb.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.elfalt.tmdb.Repositories.RepositoryData
import com.elfalt.tmdb.Ret.Movie
import com.elfalt.tmdb.Ret.MovieResponseDetails

class MovieViewModel : ViewModel() {

    fun getMovies(type : String, tbool :Int) : LiveData<List<Movie>>{
        return RepositoryData.getMovies(type, tbool)
    }

    fun getMovieDetails(movieId : String) : LiveData<MovieResponseDetails>{
        return RepositoryData.getMovieDetail(movieId)
    }

}