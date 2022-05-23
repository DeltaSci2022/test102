import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Arrays;

@Entity
@Table(name="Movies")

public class Movie {

    @Id
    @Column(name="rank")
    private int rank;

    @Column(name="year")
    private int year;

    @Column(name="cast")
    private String[] cast;

    @Column(name="director")
    private String[] director;

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

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getDirector() {
        return director;
    }

    public void setDirector(String[] director) {
        this.director = director;
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
                ", cast=" + Arrays.toString(cast) +
                ", director=" + Arrays.toString(director) +
                ", title='" + title + '\'' +
                ", rate=" + rate +
                '}';
    }
}




}
