package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"emerald",
		"firered-leafgreen",
		"ruby-sapphire"
})

public class GenerationIii implements Serializable {

	@JsonProperty("emerald")
	private Emerald emerald;
	@JsonProperty("firered-leafgreen")
	private FireredLeafgreen fireredLeafgreen;
	@JsonProperty("ruby-sapphire")
	private RubySapphire rubySapphire;
	private final static long serialVersionUID = -6370993487849708915L;

	@JsonProperty("emerald")
	public Emerald getEmerald() {
		return emerald;
	}

	@JsonProperty("emerald")
	public void setEmerald(Emerald emerald) {
		this.emerald = emerald;
	}

	@JsonProperty("firered-leafgreen")
	public FireredLeafgreen getFireredLeafgreen() {
		return fireredLeafgreen;
	}

	@JsonProperty("firered-leafgreen")
	public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
		this.fireredLeafgreen = fireredLeafgreen;
	}

	@JsonProperty("ruby-sapphire")
	public RubySapphire getRubySapphire() {
		return rubySapphire;
	}

	@JsonProperty("ruby-sapphire")
	public void setRubySapphire(RubySapphire rubySapphire) {
		this.rubySapphire = rubySapphire;
	}

}
