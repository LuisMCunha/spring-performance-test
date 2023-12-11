package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"base_stat",
		"effort",
		"stat"
})

public class Stat implements Serializable {

	@JsonProperty("base_stat")
	private int baseStat;
	@JsonProperty("effort")
	private int effort;
	@JsonProperty("stat")
	private Stat__1 stat;
	private final static long serialVersionUID = -702790316208578646L;

	@JsonProperty("base_stat")
	public int getBaseStat() {
		return baseStat;
	}

	@JsonProperty("base_stat")
	public void setBaseStat(int baseStat) {
		this.baseStat = baseStat;
	}

	@JsonProperty("effort")
	public int getEffort() {
		return effort;
	}

	@JsonProperty("effort")
	public void setEffort(int effort) {
		this.effort = effort;
	}

	@JsonProperty("stat")
	public Stat__1 getStat() {
		return stat;
	}

	@JsonProperty("stat")
	public void setStat(Stat__1 stat) {
		this.stat = stat;
	}

}
