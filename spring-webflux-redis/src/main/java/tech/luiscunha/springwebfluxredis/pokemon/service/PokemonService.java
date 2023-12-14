package tech.luiscunha.springwebfluxredis.pokemon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import tech.luiscunha.springwebfluxredis.pokemon.model.Pokemon;
import tech.luiscunha.springwebfluxredis.redis.RedisRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonService {

	@Value("${app.key-prefix}")
	private String keyPrefix;

	public final RedisRepository redis;

	public Mono<Pokemon> cachePokemon(String pokemonName, Pokemon pokemon) {
		return this.redis.putValue(keyPrefix + pokemonName, pokemon, Optional.empty());
	}

	public Mono<Pokemon> getCachedPokemon(String pokemonName) {
		return this.redis.getValue(keyPrefix + pokemonName);
	}

}
