package tech.luiscunha.springwebfluxredis.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RedisRepository {

	private final ReactiveRedisOperations<String, String> redisOperations;

	public Mono<String> putValue(String key, String val, Optional<Duration> expiresIn) {
		return redisOperations
				.opsForValue()
				.set(key, val, expiresIn.orElse(Duration.ofDays(30)))
				.map(b -> val);
	}

	public Mono<String> getValue(String key) {
		return redisOperations
				.opsForValue()
				.get(key);
	}
}
