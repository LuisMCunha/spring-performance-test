package tech.luiscunha.springwebredis.pokemon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import tech.luiscunha.springwebredis.pokemon.model.Pokemon;
import tech.luiscunha.springwebredis.pokemon.service.PokemonService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/pokemon")
public class PokemonController {

	private final PokemonService pokemonService;
	private final RestClient restClient = RestClient.builder()
			.baseUrl("https://pokeapi.co/api/v2/pokemon")
			.build();

	@GetMapping(value = "/{pokemonName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pokemon getPokemon(@PathVariable String pokemonName) throws InterruptedException {
		Thread.sleep(300);
		Pokemon pokemon = pokemonService.getCachedPokemon(pokemonName);
		if (pokemon != null) return pokemon;

		pokemon = restClient.get()
				.uri("/{pokemonName}", pokemonName)
				.retrieve()
				.body(Pokemon.class);
		pokemonService.cachePokemon(pokemonName, pokemon);
		return pokemon;

	}

}
