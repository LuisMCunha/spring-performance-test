package tech.luiscunha.springwebfluxredis.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"abilities",
		"base_experience",
		"forms",
		"game_indices",
		"height",
		"held_items",
		"id",
		"is_default",
		"location_area_encounters",
		"moves",
		"name",
		"order",
		"past_abilities",
		"past_types",
		"species",
		"sprites",
		"stats",
		"types",
		"weight"
})

public class Pokemon implements Serializable {

	@JsonProperty("abilities")
	private List<Ability> abilities;
	@JsonProperty("base_experience")
	private int baseExperience;
	@JsonProperty("forms")
	private List<Form> forms;
	@JsonProperty("game_indices")
	private List<GameIndex> gameIndices;
	@JsonProperty("height")
	private int height;
	@JsonProperty("held_items")
	private List<HeldItem> heldItems;
	@JsonProperty("id")
	private int id;
	@JsonProperty("is_default")
	private boolean isDefault;
	@JsonProperty("location_area_encounters")
	private String locationAreaEncounters;
	@JsonProperty("moves")
	private List<Move> moves;
	@JsonProperty("name")
	private String name;
	@JsonProperty("order")
	private int order;
	@JsonProperty("past_abilities")
	private List<Object> pastAbilities;
	@JsonProperty("past_types")
	private List<Object> pastTypes;
	@JsonProperty("species")
	private Species species;
	@JsonProperty("sprites")
	private Sprites sprites;
	@JsonProperty("stats")
	private List<Stat> stats;
	@JsonProperty("types")
	private List<Type> types;
	@JsonProperty("weight")
	private int weight;
	private final static long serialVersionUID = 7192138157824980406L;

	@JsonProperty("abilities")
	public List<Ability> getAbilities() {
		return abilities;
	}

	@JsonProperty("abilities")
	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	@JsonProperty("base_experience")
	public int getBaseExperience() {
		return baseExperience;
	}

	@JsonProperty("base_experience")
	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}

	@JsonProperty("forms")
	public List<Form> getForms() {
		return forms;
	}

	@JsonProperty("forms")
	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

	@JsonProperty("game_indices")
	public List<GameIndex> getGameIndices() {
		return gameIndices;
	}

	@JsonProperty("game_indices")
	public void setGameIndices(List<GameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	@JsonProperty("height")
	public int getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(int height) {
		this.height = height;
	}

	@JsonProperty("held_items")
	public List<HeldItem> getHeldItems() {
		return heldItems;
	}

	@JsonProperty("held_items")
	public void setHeldItems(List<HeldItem> heldItems) {
		this.heldItems = heldItems;
	}

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("is_default")
	public boolean isIsDefault() {
		return isDefault;
	}

	@JsonProperty("is_default")
	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	@JsonProperty("location_area_encounters")
	public String getLocationAreaEncounters() {
		return locationAreaEncounters;
	}

	@JsonProperty("location_area_encounters")
	public void setLocationAreaEncounters(String locationAreaEncounters) {
		this.locationAreaEncounters = locationAreaEncounters;
	}

	@JsonProperty("moves")
	public List<Move> getMoves() {
		return moves;
	}

	@JsonProperty("moves")
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("order")
	public int getOrder() {
		return order;
	}

	@JsonProperty("order")
	public void setOrder(int order) {
		this.order = order;
	}

	@JsonProperty("past_abilities")
	public List<Object> getPastAbilities() {
		return pastAbilities;
	}

	@JsonProperty("past_abilities")
	public void setPastAbilities(List<Object> pastAbilities) {
		this.pastAbilities = pastAbilities;
	}

	@JsonProperty("past_types")
	public List<Object> getPastTypes() {
		return pastTypes;
	}

	@JsonProperty("past_types")
	public void setPastTypes(List<Object> pastTypes) {
		this.pastTypes = pastTypes;
	}

	@JsonProperty("species")
	public Species getSpecies() {
		return species;
	}

	@JsonProperty("species")
	public void setSpecies(Species species) {
		this.species = species;
	}

	@JsonProperty("sprites")
	public Sprites getSprites() {
		return sprites;
	}

	@JsonProperty("sprites")
	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	@JsonProperty("stats")
	public List<Stat> getStats() {
		return stats;
	}

	@JsonProperty("stats")
	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	@JsonProperty("types")
	public List<Type> getTypes() {
		return types;
	}

	@JsonProperty("types")
	public void setTypes(List<Type> types) {
		this.types = types;
	}

	@JsonProperty("weight")
	public int getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
