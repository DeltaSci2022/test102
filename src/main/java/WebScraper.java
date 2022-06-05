
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;

public class WebScraper {

    // This code will scrape the 250 best movies on IMDB and create movie objects of them.
    private static final String url = "https://www.imdb.com/chart/top/";

    static ArrayList<Movie> movies = new ArrayList<Movie>();

    public static void main(String[] args) throws Exception {

        final Document document = Jsoup.connect(url).get();

        for (Element row : document.select("table.chart.full-width tr")){

            String rank = row.select(".titleColumn").text().split("\\. ",2)[0];
            String year = row.select(".titleColumn").select(".secondaryInfo").text();
            String title = row.select(".titleColumn").text().replace(year, "").replace(rank+".","");
            String rate = row.select(".imdbRating").text();
            String cleanYear = year.replaceAll("[^\\d.]", "");

            //Maak een arraylist met alle film objecten
            if (!rank.isEmpty()) {
                System.out.println(rank+" "+ year + " "+ title + " " + rate);
                //movies.add(new Movie(Integer.parseInt(rank), Integer.parseInt(cleanYear), title, Double.parseDouble(rate)));
            }
        }

        //Roep de methode aan om de objecten in de sql database te plaatsen
        addToDatabase();
    }

    private static void addToDatabase(){
        HibernateDatabaseController controller = new HibernateDatabaseController(new Movie());

        //Going through our list
        for (Movie m : movies){
            controller.create(m);
        }
        controller.closeController();
    }



}
