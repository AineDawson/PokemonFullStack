package pokemonsite.pokemonbackend.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="pokemon")
//@SecondaryTable(name="pokemonform", pkJoinColumns= {
////		@PrimaryKeyJoinColumn(name="formName"),
//		@PrimaryKeyJoinColumn(name="dexNumber")})
public class Pokemon implements Serializable{
	@Id
	@Column(nullable=false)
	private Integer dexNumber;
	@Column(nullable=false)
	private String pokemonName;
//	@Column(nullable=false)
//	private Integer generation;
	@Column(nullable=false)
	private String legendStatus;
//	@Column(nullable=false)
//	private String category;
//	@Column(nullable=false)
//	private String type1;
//	private String type2;
//	@Column(nullable=false)
//	private Double height_m;
//	@Column(nullable=false)
//	private Double weight_kg;
//	private String ability1;
//	private String ability2;
//	private String abilityHidden;
	private Integer catchRate;
	private Integer baseFriendship;
	private String growthRate;
	
//	@OneToMany private Set<PokemonForm> pokemonForm;
	
	public Pokemon() {}
	
	public Pokemon(Integer indexNumber, Integer dexNumber, String name, Integer generation, String status,
			String category, String type1, String type2, Double height, Double weight, String ability1,
			String ability2, String abilityhidden) {
//		this.indexNumber=indexNumber;
		this.dexNumber=dexNumber;
		this.pokemonName=name;
//		this.generation=generation;
		this.legendStatus=status;
//		this.category=category;
//		this.type1=type1;
//		this.type2=type2;
//		this.height_m=height;
//		this.weight_kg=weight;
//		this.ability1=ability1;
//		this.ability2=ability2;
//		this.abilityHidden=abilityhidden;
	}
	
	
//	public Integer getIndexNumber() {
//		return indexNumber;
//	}
//	public void setIndexNumber(Integer index) {
//		this.indexNumber = index;
//	}
	public Integer getDexNumber() {
		return dexNumber;
	}
	public void setDexNumber(Integer dexNumber) {
		this.dexNumber = dexNumber;
	}
	public String getName() {
		return pokemonName;
	}
	public void setName(String name) {
		this.pokemonName = name;
	}
//	public Integer getGeneration() {
//		return generation;
//	}
//	public void setGeneration(Integer generation) {
//		this.generation = generation;
//	}
	public String getStatus() {
		return legendStatus;
	}
	public void setStatus(String status) {
		this.legendStatus = status;
	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	public String getType1() {
//		return type1;
//	}
//	public void setType1(String type1) {
//		this.type1 = type1;
//	}
//	public String getType2() {
//		return type2;
//	}
//	public void setType2(String type2) {
//		this.type2 = type2;
//	}
//	public Double getHeight() {
//		return height_m;
//	}
//	public void setHeight(Double height) {
//		this.height_m = height;
//	}
//	public Double getWeight() {
//		return weight_kg;
//	}
//	public void setWeight(Double weight) {
//		this.weight_kg = weight;
//	}
//	public String getAbility1() {
//		return ability1;
//	}
//	public void setAbility1(String ability1) {
//		this.ability1 = ability1;
//	}
//	public String getAbility2() {
//		return ability2;
//	}
//	public void setAbility2(String ability2) {
//		this.ability2 = ability2;
//	}
//	public String getAbilityhidden() {
//		return abilityHidden;
//	}
//	public void setAbilityhidden(String abilityhidden) {
//		this.abilityHidden = abilityhidden;
//	}
	
//	@Override
//	public String toString() {
//		return "Pokémon{"+
//				"Index="+indexNumber+
//				", Pokédex Number="+dexNumber+
//				", Name="+pokémonName+
//				", Generation="+generation+
//				", Status="+legendStatus+
//				", Category="+category+
//				", Type="+type1+
//				", Type="+type2+
//				", Height="+height_m+
//				", Weight="+weight_kg+
//				", Abilities="+ability1+" "+ability2+" "+abilityHidden+" (hidden)";
//	}

	public Integer getCatchRate() {
		return catchRate;
	}

	public void setCatchRate(Integer catchRate) {
		this.catchRate = catchRate;
	}

	public Integer getBaseFriendship() {
		return baseFriendship;
	}

	public void setBaseFriendship(Integer baseFriendship) {
		this.baseFriendship = baseFriendship;
	}

	public String getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(String growthRate) {
		this.growthRate = growthRate;
	}
}

