package tech.luiscunha.springwebfluxredis.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import tech.luiscunha.springwebfluxredis.pokemon.model.Pokemon;

import java.time.Duration;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RedisRepository {

	private final ReactiveRedisOperations<String, Pokemon> redisOperations;

	public Mono<Pokemon> putValue(String key, Pokemon val, Optional<Duration> expiresIn) {
		return redisOperations
				.opsForValue()
				.set(key, val, expiresIn.orElse(Duration.ofDays(30)))
				.map(b -> val);
	}

	public Mono<Pokemon> getValue(String key) {
		return redisOperations
				.opsForValue()
				.get(key);
	}
}
