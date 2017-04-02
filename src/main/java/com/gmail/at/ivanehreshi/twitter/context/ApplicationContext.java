package com.gmail.at.ivanehreshi.twitter.context;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ApplicationContext implements Context {

    private Config config;
    private Map<String, Object> beans;

    public ApplicationContext(Config config) {
        this.config = config;
        this.beans = new HashMap<>();
    }

    @Override
    public <T> T getBean(String name) throws Exception {
        T bean;

        Class<?> clz =  config.getImpl(name);

        if(clz == null) {
            throw new RuntimeException("Bean not found.");
        }

        bean = (T) clz.newInstance();

        beans.put(name, bean);

        return bean;
    }
}
