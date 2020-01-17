package quotes;

public class Quote {
    String author;
    String likes;
    String text;

    public Quote(String author, String likes, String text) {
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String toString() { return this.text + "\nBy: " + this.author; }
}
