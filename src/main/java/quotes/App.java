/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

//        Reading stuff from files
        try {
            getRequest();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
//            internet fails

            Gson gson = new Gson();

            Quote[] quotes = gson.fromJson(new FileReader("src/main/resources/quotes.json"), Quote[].class);
            Quote random = quotes[randomizeQuotes(quotes.length)];
            System.out.println(random);
        }
    }

    public static int randomizeQuotes(int max) {
        int x = (int) (Math.random() * max);
        return x;
    }

    public static void getRequest() throws IOException {

        URL url = new URL("https://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote");
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");

        String data = new BufferedReader(new InputStreamReader(connect.getInputStream())).readLine();
        System.out.println(data);
        
    }
}

