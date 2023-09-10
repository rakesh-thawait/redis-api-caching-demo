package com.rt.redisapicachingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableConfigurationProperties
public class RedisApiCachingDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisApiCachingDemoApplication.class, args);
	}

}
