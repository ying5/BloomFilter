package com.ying5.util;

import io.rebloom.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;


@Component
public class RedisBloomUtil {

    @Autowired
    Client client;

    public void add(String key, String[] check){
        client.addMulti(key, check);
    }

    public void exists(String key, String[] check){
        client.existsMulti(key, check);
    }

    public void add(String key, String check){
        client.add(key, check);
    }

    public boolean exists(String key, String check){
        return client.exists(key, check);
    }

}
