package tech.luiscunha.springwebredis.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Repository;
import tech.luiscunha.springwebredis.pokemon.model.Pokemon;

import java.time.Duration;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RedisRepository {

	private final RedisOperations<String, Pokemon> redisOps;

	public void putValue(String key, Pokemon val, Optional<Duration> expiresIn) {
		redisOps.opsForValue().set(key, val, expiresIn.orElse(Duration.ofMinutes(30)));
	}

	public Pokemon getValue(String key) {
		return redisOps.opsForValue().get(key);
	}
}
