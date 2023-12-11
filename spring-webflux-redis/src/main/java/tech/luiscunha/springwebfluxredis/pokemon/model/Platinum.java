package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"back_default",
		"back_female",
		"back_shiny",
		"back_shiny_female",
		"front_default",
		"front_female",
		"front_shiny",
		"front_shiny_female"
})

public class Platinum implements Serializable {

	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_female")
	private Object backFemale;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("back_shiny_female")
	private Object backShinyFemale;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_female")
	private Object frontFemale;
	@JsonProperty("front_shiny")
	private String frontShiny;
	@JsonProperty("front_shiny_female")
	private Object frontShinyFemale;
	private final static long serialVersionUID = -3737408751344517778L;

	@JsonProperty("back_default")
	public String getBackDefault() {
		return backDefault;
	}

	@JsonProperty("back_default")
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	@JsonProperty("back_female")
	public Object getBackFemale() {
		return backFemale;
	}

	@JsonProperty("back_female")
	public void setBackFemale(Object backFemale) {
		this.backFemale = backFemale;
	}

	@JsonProperty("back_shiny")
	public String getBackShiny() {
		return backShiny;
	}

	@JsonProperty("back_shiny")
	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
	}

	@JsonProperty("back_shiny_female")
	public Object getBackShinyFemale() {
		return backShinyFemale;
	}

	@JsonProperty("back_shiny_female")
	public void setBackShinyFemale(Object backShinyFemale) {
		this.backShinyFemale = backShinyFemale;
	}

	@JsonProperty("front_default")
	public String getFrontDefault() {
		return frontDefault;
	}

	@JsonProperty("front_default")
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	@JsonProperty("front_female")
	public Object getFrontFemale() {
		return frontFemale;
	}

	@JsonProperty("front_female")
	public void setFrontFemale(Object frontFemale) {
		this.frontFemale = frontFemale;
	}

	@JsonProperty("front_shiny")
	public String getFrontShiny() {
		return frontShiny;
	}

	@JsonProperty("front_shiny")
	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}

	@JsonProperty("front_shiny_female")
	public Object getFrontShinyFemale() {
		return frontShinyFemale;
	}

	@JsonProperty("front_shiny_female")
	public void setFrontShinyFemale(Object frontShinyFemale) {
		this.frontShinyFemale = frontShinyFemale;
	}

}
