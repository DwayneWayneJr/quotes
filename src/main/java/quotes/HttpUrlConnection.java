package quotes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnection {

    public void getRequest(String requestURL) throws IOException {

        URL url = new URL("https://andruxnet-random-famous-quotes.p.rapidapi.com/?cat=famous&count=10");
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");

        connect.setRequestProperty("Content-Type", );
    }
}
