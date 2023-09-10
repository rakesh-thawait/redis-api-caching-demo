package com.rt.redisapicachingdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;


@Configuration
public class RedisConfig {
    @Autowired
    AppProperties appProperties;
    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig() //
                .entryTtl(Duration.ofMinutes(appProperties.ttl)) // TTL
                .disableCachingNullValues();

        return RedisCacheManager.builder(connectionFactory) //
                .cacheDefaults(config) //
                .build();
    }

}
