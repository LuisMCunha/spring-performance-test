package tech.luiscunha.springwebredis.pokemon.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("api/v1/pokemon")
public class PokemonController {

	private final RestClient restClient = RestClient.builder()
			.baseUrl("https://pokeapi.co/api/v2/pokemon")
			.build();

	@GetMapping(value = "/{pokemonName}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Cacheable(value = "pokemon", key = "#pokemonName")
	public String getPokemon(@PathVariable String pokemonName) {
		return restClient.get()
				.uri("/{pokemonName}", pokemonName)
				.retrieve()
				.body(String.class);
	}

}
