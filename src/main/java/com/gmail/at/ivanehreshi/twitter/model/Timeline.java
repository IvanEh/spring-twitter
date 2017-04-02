package com.gmail.at.ivanehreshi.twitter.model;

import java.util.List;

public class Timeline {
    private List<Tweet> tweets;

    public Timeline(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }
}
