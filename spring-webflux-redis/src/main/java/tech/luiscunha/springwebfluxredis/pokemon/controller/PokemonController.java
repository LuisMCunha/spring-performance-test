package tech.luiscunha.springwebfluxredis.pokemon.controller;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import tech.luiscunha.springwebfluxredis.pokemon.service.PokemonService;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/pokemon")
public class PokemonController {

	private final WebClient webClient = WebClient.builder()
			.baseUrl("https://pokeapi.co/api/v2/pokemon")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();

	private final PokemonService pokemonService;

	@GetMapping(value = "/{pokemonName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> getPokemon(@PathVariable String pokemonName) {

		return pokemonService.retrieveCachedPokemon(pokemonName)
				.map(pokemon -> pokemon)
				.switchIfEmpty(webClient.get()
						.uri("/{pokemonName}", pokemonName)
						.retrieve()
						.bodyToMono(String.class)
						.flatMap(pokemonResponse -> pokemonService.cachePokemon(pokemonName, pokemonResponse))
				);
	}
}
