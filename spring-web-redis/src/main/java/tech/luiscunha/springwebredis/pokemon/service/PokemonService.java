package tech.luiscunha.springwebredis.pokemon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tech.luiscunha.springwebredis.pokemon.model.Pokemon;
import tech.luiscunha.springwebredis.redis.RedisRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonService {

	@Value("${app.key-prefix}")
	private String keyPrefix;

	public final RedisRepository redis;

	public void cachePokemon(String pokemonName, Pokemon pokemon) {
		this.redis.putValue(keyPrefix + pokemonName, pokemon, Optional.empty());
	}

	public Pokemon getCachedPokemon(String pokemonName) {
		return this.redis.getValue(keyPrefix + pokemonName);
	}
}
