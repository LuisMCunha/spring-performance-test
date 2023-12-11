package tech.luiscunha.springwebfluxredis.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;


@Configuration
public class RedisConfig {

  @Bean
  public ReactiveRedisOperations<String, String> redisOperations(ReactiveRedisConnectionFactory reactiveRedisConnectionFactory) {
    Jackson2JsonRedisSerializer<String> serializer = new Jackson2JsonRedisSerializer<>(String.class);

    RedisSerializationContext.RedisSerializationContextBuilder<String, String> builder =
        RedisSerializationContext.newSerializationContext(serializer);

    RedisSerializationContext<String, String> context =
        builder
            .value(serializer)
            .hashValue(serializer)
            .build();

    return new ReactiveRedisTemplate<>(reactiveRedisConnectionFactory, context);
  }
}
