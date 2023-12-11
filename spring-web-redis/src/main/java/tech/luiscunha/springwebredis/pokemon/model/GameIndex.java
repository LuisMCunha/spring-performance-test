package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"game_index",
		"version"
})

public class GameIndex implements Serializable {

	@JsonProperty("game_index")
	private int gameIndex;
	@JsonProperty("version")
	private Version version;
	private final static long serialVersionUID = 7760640514478422741L;

	@JsonProperty("game_index")
	public int getGameIndex() {
		return gameIndex;
	}

	@JsonProperty("game_index")
	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	@JsonProperty("version")
	public Version getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(Version version) {
		this.version = version;
	}

}
