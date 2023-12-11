package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"crystal",
		"gold",
		"silver"
})

public class GenerationIi implements Serializable {

	@JsonProperty("crystal")
	private Crystal crystal;
	@JsonProperty("gold")
	private Gold gold;
	@JsonProperty("silver")
	private Silver silver;
	private final static long serialVersionUID = 4141686787730051917L;

	@JsonProperty("crystal")
	public Crystal getCrystal() {
		return crystal;
	}

	@JsonProperty("crystal")
	public void setCrystal(Crystal crystal) {
		this.crystal = crystal;
	}

	@JsonProperty("gold")
	public Gold getGold() {
		return gold;
	}

	@JsonProperty("gold")
	public void setGold(Gold gold) {
		this.gold = gold;
	}

	@JsonProperty("silver")
	public Silver getSilver() {
		return silver;
	}

	@JsonProperty("silver")
	public void setSilver(Silver silver) {
		this.silver = silver;
	}

}
