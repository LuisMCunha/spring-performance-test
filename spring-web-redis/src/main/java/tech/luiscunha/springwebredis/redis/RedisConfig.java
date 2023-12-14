package tech.luiscunha.springwebredis.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import tech.luiscunha.springwebredis.pokemon.model.Pokemon;

import java.time.Duration;

import static org.springframework.data.redis.cache.RedisCacheConfiguration.defaultCacheConfig;

@Configuration
public class RedisConfig {

	@Bean
	public RedisCacheManager cacheManager(final RedisConnectionFactory connectionFactory) {
		return RedisCacheManager.builder(connectionFactory)
				.cacheDefaults(defaultCacheConfig()
						.entryTtl(Duration.ofMinutes(60))
						.disableCachingNullValues()
				)
				.build();
	}


	@Bean
	RedisTemplate<String, Pokemon> redisTemplate(RedisConnectionFactory connectionFactory) {

		RedisTemplate<String, Pokemon> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Pokemon.class));
		return template;
	}

}
