## Project: redis-api-caching-demo

# Important instruction

### Steps to run this project
1. Have docker installed on your machine
2. Run docker-compose -f docker-compose-redis.yml up
3. Run this SpringBoot application


### Notes
When @Cacheable is used to cache the component, it uses ConcurrentHashMap by default but if any caching tool like Gemfire or Redis is present in the classpath then the caching tool is used.

### Important annotation to remember:
@EnableCaching <br>
@Cacheable