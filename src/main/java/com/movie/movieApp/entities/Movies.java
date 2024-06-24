package com.movie.movieApp.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String title;

    private String director;

    private String studio;

    private String poster;

    private Integer releaseYear;

    private Set<String> movieCast;
    
}
