package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"black-white"
})

public class GenerationV implements Serializable {

	@JsonProperty("black-white")
	private BlackWhite blackWhite;
	private final static long serialVersionUID = -8464437451691281202L;

	@JsonProperty("black-white")
	public BlackWhite getBlackWhite() {
		return blackWhite;
	}

	@JsonProperty("black-white")
	public void setBlackWhite(BlackWhite blackWhite) {
		this.blackWhite = blackWhite;
	}

}
