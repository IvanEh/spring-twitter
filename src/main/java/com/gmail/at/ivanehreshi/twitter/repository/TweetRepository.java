package com.gmail.at.ivanehreshi.twitter.repository;

import com.gmail.at.ivanehreshi.twitter.model.Tweet;

public interface TweetRepository {
    void save(Tweet tweet);
    Iterable<Tweet> findAll();
}
