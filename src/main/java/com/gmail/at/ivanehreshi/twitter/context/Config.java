package com.gmail.at.ivanehreshi.twitter.context;

public interface Config {
    Class<?> getImpl(String name);
}
