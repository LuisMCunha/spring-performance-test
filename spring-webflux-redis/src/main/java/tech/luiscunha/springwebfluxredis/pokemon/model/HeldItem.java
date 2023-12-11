package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"item",
		"version_details"
})

public class HeldItem implements Serializable {

	@JsonProperty("item")
	private Item item;
	@JsonProperty("version_details")
	private List<VersionDetail> versionDetails;
	private final static long serialVersionUID = 3946588993624322297L;

	@JsonProperty("item")
	public Item getItem() {
		return item;
	}

	@JsonProperty("item")
	public void setItem(Item item) {
		this.item = item;
	}

	@JsonProperty("version_details")
	public List<VersionDetail> getVersionDetails() {
		return versionDetails;
	}

	@JsonProperty("version_details")
	public void setVersionDetails(List<VersionDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

}
