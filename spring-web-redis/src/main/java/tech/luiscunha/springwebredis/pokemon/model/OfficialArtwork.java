package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"front_default",
		"front_shiny"
})

public class OfficialArtwork implements Serializable {

	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	private final static long serialVersionUID = -1522134794674430205L;

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
