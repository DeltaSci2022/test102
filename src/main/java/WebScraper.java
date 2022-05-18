import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

public class WebScraper {

    // This code will scrape the 250 best movies on IMDB and create movie objects of them.
    private static final String url = "https://www.imdb.com/chart/top/";

    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions().setCssEnabled(false);

        try {
            HtmlPage page = client.getPage(url);
            System.out.println(page.asXml());
        } catch (IOException e) {
            e.printStackTrace();
        }




    }



}
