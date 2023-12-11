package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"diamond-pearl",
		"heartgold-soulsilver",
		"platinum"
})

public class GenerationIv implements Serializable {

	@JsonProperty("diamond-pearl")
	private DiamondPearl diamondPearl;
	@JsonProperty("heartgold-soulsilver")
	private HeartgoldSoulsilver heartgoldSoulsilver;
	@JsonProperty("platinum")
	private Platinum platinum;
	private final static long serialVersionUID = -7716048166829750776L;

	@JsonProperty("diamond-pearl")
	public DiamondPearl getDiamondPearl() {
		return diamondPearl;
	}

	@JsonProperty("diamond-pearl")
	public void setDiamondPearl(DiamondPearl diamondPearl) {
		this.diamondPearl = diamondPearl;
	}

	@JsonProperty("heartgold-soulsilver")
	public HeartgoldSoulsilver getHeartgoldSoulsilver() {
		return heartgoldSoulsilver;
	}

	@JsonProperty("heartgold-soulsilver")
	public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
		this.heartgoldSoulsilver = heartgoldSoulsilver;
	}

	@JsonProperty("platinum")
	public Platinum getPlatinum() {
		return platinum;
	}

	@JsonProperty("platinum")
	public void setPlatinum(Platinum platinum) {
		this.platinum = platinum;
	}

}
