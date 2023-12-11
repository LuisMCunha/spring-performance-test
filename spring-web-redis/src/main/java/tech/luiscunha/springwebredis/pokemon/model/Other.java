package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"dream_world",
		"home",
		"official-artwork"
})

public class Other implements Serializable {

	@JsonProperty("dream_world")
	private DreamWorld dreamWorld;
	@JsonProperty("home")
	private Home home;
	@JsonProperty("official-artwork")
	private OfficialArtwork officialArtwork;
	private final static long serialVersionUID = -7970235653352508818L;

	@JsonProperty("dream_world")
	public DreamWorld getDreamWorld() {
		return dreamWorld;
	}

	@JsonProperty("dream_world")
	public void setDreamWorld(DreamWorld dreamWorld) {
		this.dreamWorld = dreamWorld;
	}

	@JsonProperty("home")
	public Home getHome() {
		return home;
	}

	@JsonProperty("home")
	public void setHome(Home home) {
		this.home = home;
	}

	@JsonProperty("official-artwork")
	public OfficialArtwork getOfficialArtwork() {
		return officialArtwork;
	}

	@JsonProperty("official-artwork")
	public void setOfficialArtwork(OfficialArtwork officialArtwork) {
		this.officialArtwork = officialArtwork;
	}

}
