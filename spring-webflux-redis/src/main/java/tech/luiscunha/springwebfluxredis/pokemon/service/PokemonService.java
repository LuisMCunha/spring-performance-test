package tech.luiscunha.springwebfluxredis.pokemon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import tech.luiscunha.springwebfluxredis.redis.RedisRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonService {
  public final RedisRepository redis;

  private static final String POKEMON_OBJECT_KEY = "pokemon:";

  public Mono<String> cachePokemon(String pokemonName, String pokemon) {
    return this.redis.putValue(POKEMON_OBJECT_KEY + pokemonName, pokemon, Optional.empty());
  }

  public Mono<String> retrieveCachedPokemon(String pokemonName) {
    return this.redis.getValue(POKEMON_OBJECT_KEY + pokemonName);
  }

}
