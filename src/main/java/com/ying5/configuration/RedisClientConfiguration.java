package com.ying5.configuration;

import io.rebloom.client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisClientConfiguration {

    @Bean
    public Client redisClient(){
        Client client = new Client("ali.cloud.com",6379);
        return client;
    }
}
