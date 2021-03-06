/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class AppTest {

    @Test public void testQuote() throws FileNotFoundException {

        Gson gson = new Gson();

        Quote[] quotes = gson.fromJson(new FileReader("src/main/resources/quotes.json"), Quote[].class);
        assertNotNull(quotes);
    }

    @Test public void randomizeQuotesTest() {

        for (int i = 0; i < 1000; i++) {
            int random = App.randomizeQuotes(5);
            assertTrue(random < 5);
            assertTrue(random > -1);
        }
    }
}
