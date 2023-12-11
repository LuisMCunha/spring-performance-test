package tech.luiscunha.springwebredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"move",
		"version_group_details"
})

public class Move implements Serializable {

	@JsonProperty("move")
	private Move__1 move;
	@JsonProperty("version_group_details")
	private List<VersionGroupDetail> versionGroupDetails;
	private final static long serialVersionUID = -7396559777034949787L;

	@JsonProperty("move")
	public Move__1 getMove() {
		return move;
	}

	@JsonProperty("move")
	public void setMove(Move__1 move) {
		this.move = move;
	}

	@JsonProperty("version_group_details")
	public List<VersionGroupDetail> getVersionGroupDetails() {
		return versionGroupDetails;
	}

	@JsonProperty("version_group_details")
	public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
		this.versionGroupDetails = versionGroupDetails;
	}

}
