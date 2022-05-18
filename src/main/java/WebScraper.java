import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class WebScraper {

    // This code will scrape the 250 best movies on IMDB and create movie objects of them.
    private static final String url = "https://www.imdb.com/chart/top/";

    public static void main(String[] args) throws Exception {

        final Document document = Jsoup.connect(url).get();
        ArrayList<Film> filmList = new ArrayList<Film>();

        for (Element row : document.select("table.chart.full-width tr")){
           String rankNameYear = row.select(".titleColumn").text();
            System.out.println(rankNameYear);

            String rank = splitter(rankNameYear,".",0);
            System.out.println(rank);

//            movie.setRank(Integer.parseInt(splitter(rankNameYear, ".", 0)));
//            movie.setTitle(splitter(rankNameYear, "(", 0));
//            movie.setYear(Integer.parseInt(splitter(rankNameYear, "(", 1).replace(")","")));
//            movie.setRate(Double.parseDouble(row.select(".imdbRating").text()));
//            filmList.add(movie);
        }













    }

    static String splitter(String input, String regex, int number){
        String[] data = input.split(regex);
        return data[number].trim();
    }



}
