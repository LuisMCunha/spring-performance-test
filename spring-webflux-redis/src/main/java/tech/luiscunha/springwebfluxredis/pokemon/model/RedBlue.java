package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"back_default",
		"back_gray",
		"back_transparent",
		"front_default",
		"front_gray",
		"front_transparent"
})

public class RedBlue implements Serializable {

	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_gray")
	private String backGray;
	@JsonProperty("back_transparent")
	private String backTransparent;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_gray")
	private String frontGray;
	@JsonProperty("front_transparent")
	private String frontTransparent;
	private final static long serialVersionUID = -301839473750083486L;

	@JsonProperty("back_default")
	public String getBackDefault() {
		return backDefault;
	}

	@JsonProperty("back_default")
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	@JsonProperty("back_gray")
	public String getBackGray() {
		return backGray;
	}

	@JsonProperty("back_gray")
	public void setBackGray(String backGray) {
		this.backGray = backGray;
	}

	@JsonProperty("back_transparent")
	public String getBackTransparent() {
		return backTransparent;
	}

	@JsonProperty("back_transparent")
	public void setBackTransparent(String backTransparent) {
		this.backTransparent = backTransparent;
	}

	@JsonProperty("front_default")
	public String getFrontDefault() {
		return frontDefault;
	}

	@JsonProperty("front_default")
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	@JsonProperty("front_gray")
	public String getFrontGray() {
		return frontGray;
	}

	@JsonProperty("front_gray")
	public void setFrontGray(String frontGray) {
		this.frontGray = frontGray;
	}

	@JsonProperty("front_transparent")
	public String getFrontTransparent() {
		return frontTransparent;
	}

	@JsonProperty("front_transparent")
	public void setFrontTransparent(String frontTransparent) {
		this.frontTransparent = frontTransparent;
	}

}
