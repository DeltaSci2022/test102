import java.util.Arrays;

public class Film {

    private int rank;
    private int year;
    private String[] cast;
    private String[] director;
    private String title;
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

    public String toString(){
        return rank + " " + title + " " + year + " " + Arrays.toString(cast) + " " + rate + " "+ Arrays.toString(director);
    }




}
