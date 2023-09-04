package com.rt.redisapicachingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisApiCachingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApiCachingDemoApplication.class, args);
	}

}
