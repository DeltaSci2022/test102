package com.simon.jackson.demo;

import javax.persistence.*;

@Entity
@Table(name="movies")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movie_id")
    private int movieId;


    @Column(name="movie_rank")
    private int rank;

    @Column(name="year")
    private int year;

    @Column(name="title")
    private String title;

    @Column(name="rate")
    private double rate;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double score) {
        this.rate = score;
    }

    public Movie(int rank, int year, String title, double rate) {
        this.rank = rank;
        this.year = year;
        this.title = title;
        this.rate = rate;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rank=" + rank +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", rate=" + rate +
                '}';
    }
}



