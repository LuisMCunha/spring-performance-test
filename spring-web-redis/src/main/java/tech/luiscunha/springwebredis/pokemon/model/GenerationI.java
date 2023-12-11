package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"red-blue",
		"yellow"
})

public class GenerationI implements Serializable {

	@JsonProperty("red-blue")
	private RedBlue redBlue;
	@JsonProperty("yellow")
	private Yellow yellow;
	private final static long serialVersionUID = 1626441577519742571L;

	@JsonProperty("red-blue")
	public RedBlue getRedBlue() {
		return redBlue;
	}

	@JsonProperty("red-blue")
	public void setRedBlue(RedBlue redBlue) {
		this.redBlue = redBlue;
	}

	@JsonProperty("yellow")
	public Yellow getYellow() {
		return yellow;
	}

	@JsonProperty("yellow")
	public void setYellow(Yellow yellow) {
		this.yellow = yellow;
	}

}
