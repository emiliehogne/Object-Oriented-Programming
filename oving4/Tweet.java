package oving4;

public class Tweet {
    private TwitterAccount owner;
    private Tweet original;
    private String tekst;
    private int numberOfRetweets;

    public Tweet(TwitterAccount acc, String s) {
        this.owner = acc;
        this.tekst = s;

    }

    public Tweet(TwitterAccount acc, Tweet t) {
        if (t.getOwner() == acc) {
            throw new IllegalArgumentException("Cannot retweet own tweet");
        } else {
            this.tekst = t.tekst;
            this.owner = acc;
            this.original = t;
            t.numberOfRetweets++;
        }

    }

    public String getText() {
        return this.tekst;

    }

    public TwitterAccount getOwner() {
        return this.owner;

    }

    public Tweet getOriginalTweet() {
        if (original != null) {
            return this.original;

        } else
            return null;

    }

    public int getRetweetCount() {
        return this.numberOfRetweets;
    }
}
