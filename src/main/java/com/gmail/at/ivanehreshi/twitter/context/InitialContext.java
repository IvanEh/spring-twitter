package com.gmail.at.ivanehreshi.twitter.context;

public class InitialContext {
    private Config config;

    public InitialContext() {
    }

    public InitialContext(Config config) {
        this.config = config;
    }

    public Object lookup(String name) throws IllegalAccessException, InstantiationException {
        Class<?> clz = config.getImpl(name);
        return clz.newInstance();
    }
}
