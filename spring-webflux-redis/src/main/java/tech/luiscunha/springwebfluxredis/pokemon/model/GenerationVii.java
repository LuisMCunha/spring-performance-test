package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"icons",
		"ultra-sun-ultra-moon"
})

public class GenerationVii implements Serializable {

	@JsonProperty("icons")
	private Icons icons;
	@JsonProperty("ultra-sun-ultra-moon")
	private UltraSunUltraMoon ultraSunUltraMoon;
	private final static long serialVersionUID = -6750269258430612732L;

	@JsonProperty("icons")
	public Icons getIcons() {
		return icons;
	}

	@JsonProperty("icons")
	public void setIcons(Icons icons) {
		this.icons = icons;
	}

	@JsonProperty("ultra-sun-ultra-moon")
	public UltraSunUltraMoon getUltraSunUltraMoon() {
		return ultraSunUltraMoon;
	}

	@JsonProperty("ultra-sun-ultra-moon")
	public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon) {
		this.ultraSunUltraMoon = ultraSunUltraMoon;
	}

}
