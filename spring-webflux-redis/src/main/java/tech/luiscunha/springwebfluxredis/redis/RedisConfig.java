package tech.luiscunha.springwebfluxredis.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import tech.luiscunha.springwebfluxredis.pokemon.model.Pokemon;


@Configuration
public class RedisConfig {

	@Bean
	public ReactiveRedisOperations<String, Pokemon> redisOperations(ReactiveRedisConnectionFactory reactiveRedisConnectionFactory) {
		Jackson2JsonRedisSerializer<Pokemon> serializer = new Jackson2JsonRedisSerializer<>(Pokemon.class);

		RedisSerializationContext.RedisSerializationContextBuilder<String, Pokemon> builder =
				RedisSerializationContext.newSerializationContext(new Jackson2JsonRedisSerializer<>(Pokemon.class));

		RedisSerializationContext<String, Pokemon> context =
				builder
						.value(serializer)
						.build();

		return new ReactiveRedisTemplate<>(reactiveRedisConnectionFactory, context);
	}
}
