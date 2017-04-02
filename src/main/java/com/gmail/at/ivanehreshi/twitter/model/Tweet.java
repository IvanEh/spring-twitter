package com.gmail.at.ivanehreshi.twitter.model;

public class Tweet {
    private User user;
    private String text;

    public Tweet(User user, String text) {
        this.user = user;
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "text='" + text + '\'' +
                '}';
    }
}
