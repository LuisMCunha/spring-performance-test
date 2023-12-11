package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"back_default",
		"back_shiny",
		"front_default",
		"front_shiny"
})

public class FireredLeafgreen implements Serializable {

	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	private final static long serialVersionUID = -8643565011173928667L;

	@JsonProperty("back_default")
	public String getBackDefault() {
		return backDefault;
	}

	@JsonProperty("back_default")
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	@JsonProperty("back_shiny")
	public String getBackShiny() {
		return backShiny;
	}

	@JsonProperty("back_shiny")
	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
	}

	@JsonProperty("front_default")
	public String getFrontDefault() {
		return frontDefault;
	}

	@JsonProperty("front_default")
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	@JsonProperty("front_shiny")
	public String getFrontShiny() {
		return frontShiny;
	}

	@JsonProperty("front_shiny")
	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}

}
