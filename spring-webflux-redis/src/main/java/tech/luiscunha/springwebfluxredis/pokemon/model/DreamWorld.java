package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"front_default",
		"front_female"
})

public class DreamWorld implements Serializable {

	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_female")
	private Object frontFemale;
	private final static long serialVersionUID = -613125832351088841L;

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

}
