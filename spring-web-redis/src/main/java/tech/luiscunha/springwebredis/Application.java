package tech.luiscunha.springwebredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import tech.luiscunha.springwebredis.pokemon.model.Pokemon;

import java.time.Duration;

import static org.springframework.data.redis.cache.RedisCacheConfiguration.defaultCacheConfig;

@EnableCaching
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RedisCacheManager cacheManager(final RedisConnectionFactory connectionFactory) {
		return RedisCacheManager.builder(connectionFactory)
				.cacheDefaults(defaultCacheConfig()
						.serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new Jackson2JsonRedisSerializer<>(Pokemon.class)))
						.computePrefixWith(cacheName -> cacheName + ":")
						.entryTtl(Duration.ofMinutes(60))
						.disableCachingNullValues()
				)
				.build();
	}

	@EventListener(ApplicationReadyEvent.class)
	public void cleanupStartupMemory() {
		System.gc();
	}
}
