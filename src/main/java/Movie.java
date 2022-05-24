import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")

public class Movie {

    @Id
    @Column(name="movie_rank")
    private String rank;

    @Column(name="year")
    private String year;

    @Column(name="title")
    private String title;

    @Column(name="rate")
    private String rate;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String score) {
        this.rate = score;
    }

    public Movie(String rank, String year, String title, String rate) {
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



