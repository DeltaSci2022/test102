import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;

public class WebScraper {

    // This code will scrape the 250 best movies on IMDB and create movie objects of them.
    private static final String url = "https://www.imdb.com/chart/top/";

    public static void main(String[] args) throws Exception {

        final Document document = Jsoup.connect(url).get();
        ArrayList<Movie> movieList = new ArrayList<Movie>();

        for (Element row : document.select("table.chart.full-width tr")){

                String rank = row.select(".titleColumn").text().split("\\. ",2)[0];
                String year = row.select(".titleColumn").select(".secondaryInfo").text();
                String title = row.select(".titleColumn").text().replace(year, "").replace(rank+".","");
                String rate = row.select(".imdbRating").text();
                Movie film = new Movie();

            System.out.println("Rank: " + rank + " Year: "+ year+ " Rate: "+rate+" Title: "+title);















    }





}
}
