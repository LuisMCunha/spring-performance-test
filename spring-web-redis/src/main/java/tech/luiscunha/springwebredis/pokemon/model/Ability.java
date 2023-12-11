package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"ability",
		"is_hidden",
		"slot"
})

public class Ability implements Serializable {

	@JsonProperty("ability")
	private Ability__1 ability;
	@JsonProperty("is_hidden")
	private boolean isHidden;
	@JsonProperty("slot")
	private int slot;
	private final static long serialVersionUID = 6516525808761778676L;

	@JsonProperty("ability")
	public Ability__1 getAbility() {
		return ability;
	}

	@JsonProperty("ability")
	public void setAbility(Ability__1 ability) {
		this.ability = ability;
	}

	@JsonProperty("is_hidden")
	public boolean isIsHidden() {
		return isHidden;
	}

	@JsonProperty("is_hidden")
	public void setIsHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	@JsonProperty("slot")
	public int getSlot() {
		return slot;
	}

	@JsonProperty("slot")
	public void setSlot(int slot) {
		this.slot = slot;
	}

}
