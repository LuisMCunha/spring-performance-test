package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"rarity",
		"version"
})

public class VersionDetail implements Serializable {

	@JsonProperty("rarity")
	private int rarity;
	@JsonProperty("version")
	private Version__1 version;
	private final static long serialVersionUID = 1407119418004736351L;

	@JsonProperty("rarity")
	public int getRarity() {
		return rarity;
	}

	@JsonProperty("rarity")
	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	@JsonProperty("version")
	public Version__1 getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(Version__1 version) {
		this.version = version;
	}

}
