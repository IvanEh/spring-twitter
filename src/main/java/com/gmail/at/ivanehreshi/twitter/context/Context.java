package com.gmail.at.ivanehreshi.twitter.context;

public interface Context {
    <T> T getBean(String name) throws Exception;
}
