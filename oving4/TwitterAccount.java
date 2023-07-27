package oving4;

import java.util.ArrayList;
import java.util.List;

public class TwitterAccount {
    private String userName;
    List<TwitterAccount> following = new ArrayList<>();
    List<TwitterAccount> followers = new ArrayList<>();
    List<Tweet> tweets = new ArrayList<>();
    List<Tweet> Retweets = new ArrayList<>();

    public TwitterAccount(String s) {
        this.userName = s;

    }

    public String getUserName() {
        return userName;
    }

    public void follow(TwitterAccount account) {
        if (!following.contains(account)) {
            following.add(account);
            account.followers.add(this);
        } else
            throw new IllegalArgumentException("You already follow this account");

    }

    public void unfollow(TwitterAccount account) {
        if (following.contains(account)) {
            account.followers.remove(this);
            following.remove(account);

        }

    }

    public boolean isFollowing(TwitterAccount account) {
        return following.contains(account);
    }

    public boolean isFollowedBy(TwitterAccount account) {
        return followers.contains(account);
    }

    public void tweet(String s) {
        Tweet tweet = new Tweet(this, s);
        tweets.add(0, tweet);

    }

    public void retweet(Tweet tweet) {
        Tweet t = new Tweet(this, tweet);
        tweets.add(t);
        if (tweet.getOriginalTweet() == null) {
            tweet.getOwner().Retweets.add(0, t);
        } else {
            tweet.getOriginalTweet().getOwner().Retweets.add(0, t);
        }

    }

    public Tweet getTweet(int i) {
        return tweets.get(i - 1);

    }

    public int getTweetCount() {
        return tweets.size();
    }

    public int getRetweetCount() {
        return Retweets.size();
    }

}
