package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"icons"
})

public class GenerationViii implements Serializable {

	@JsonProperty("icons")
	private Icons__1 icons;
	private final static long serialVersionUID = 3202517936826228112L;

	@JsonProperty("icons")
	public Icons__1 getIcons() {
		return icons;
	}

	@JsonProperty("icons")
	public void setIcons(Icons__1 icons) {
		this.icons = icons;
	}

}
