package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"omegaruby-alphasapphire",
		"x-y"
})

public class GenerationVi implements Serializable {

	@JsonProperty("omegaruby-alphasapphire")
	private OmegarubyAlphasapphire omegarubyAlphasapphire;
	@JsonProperty("x-y")
	private XY xY;
	private static final long serialVersionUID = 4554757702081679544L;

	@JsonProperty("omegaruby-alphasapphire")
	public OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
		return omegarubyAlphasapphire;
	}

	@JsonProperty("omegaruby-alphasapphire")
	public void setOmegarubyAlphasapphire(OmegarubyAlphasapphire omegarubyAlphasapphire) {
		this.omegarubyAlphasapphire = omegarubyAlphasapphire;
	}

	@JsonProperty("x-y")
	public XY getxY() {
		return xY;
	}

	@JsonProperty("x-y")
	public void setxY(XY xY) {
		this.xY = xY;
	}

}
