package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"slot",
		"type"
})

public class Type implements Serializable {

	@JsonProperty("slot")
	private int slot;
	@JsonProperty("type")
	private Type__1 type;
	private final static long serialVersionUID = 1699238294801141042L;

	@JsonProperty("slot")
	public int getSlot() {
		return slot;
	}

	@JsonProperty("slot")
	public void setSlot(int slot) {
		this.slot = slot;
	}

	@JsonProperty("type")
	public Type__1 getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Type__1 type) {
		this.type = type;
	}

}
