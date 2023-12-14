package tech.luiscunha.springwebfluxredis.pokemon.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import tech.luiscunha.springwebfluxredis.pokemon.model.Pokemon;
import tech.luiscunha.springwebfluxredis.pokemon.service.PokemonService;

import java.time.Duration;

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
	public Mono<Pokemon> getPokemon(@PathVariable String pokemonName) {

		return pokemonService.getCachedPokemon(pokemonName)
				.delayElement(Duration.ofMillis(300))
				.switchIfEmpty(
						webClient.get()
								.uri("/{pokemonName}", pokemonName)
								.retrieve()
								.bodyToMono(Pokemon.class)
								.timeout(Duration.ofSeconds(5))
								.delayElement(Duration.ofMillis(300))
								.flatMap(pokemonResponse -> pokemonService.cachePokemon(pokemonName, pokemonResponse))
				);
	}
}
