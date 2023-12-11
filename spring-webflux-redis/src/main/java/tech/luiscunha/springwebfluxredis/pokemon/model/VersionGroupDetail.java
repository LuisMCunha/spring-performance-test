package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"level_learned_at",
		"move_learn_method",
		"version_group"
})

public class VersionGroupDetail implements Serializable {

	@JsonProperty("level_learned_at")
	private int levelLearnedAt;
	@JsonProperty("move_learn_method")
	private MoveLearnMethod moveLearnMethod;
	@JsonProperty("version_group")
	private VersionGroup versionGroup;
	private final static long serialVersionUID = 4750453674067757548L;

	@JsonProperty("level_learned_at")
	public int getLevelLearnedAt() {
		return levelLearnedAt;
	}

	@JsonProperty("level_learned_at")
	public void setLevelLearnedAt(int levelLearnedAt) {
		this.levelLearnedAt = levelLearnedAt;
	}

	@JsonProperty("move_learn_method")
	public MoveLearnMethod getMoveLearnMethod() {
		return moveLearnMethod;
	}

	@JsonProperty("move_learn_method")
	public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
		this.moveLearnMethod = moveLearnMethod;
	}

	@JsonProperty("version_group")
	public VersionGroup getVersionGroup() {
		return versionGroup;
	}

	@JsonProperty("version_group")
	public void setVersionGroup(VersionGroup versionGroup) {
		this.versionGroup = versionGroup;
	}

}
