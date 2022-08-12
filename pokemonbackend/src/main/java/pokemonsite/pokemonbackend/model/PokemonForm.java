package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@IdClass(PokemonFormId.class)
@Table(name="pokemonform")
//@SecondaryTable(name="pokemon", pkJoinColumns= {
////	@PrimaryKeyJoinColumn(name="pokemonName"),
//	@PrimaryKeyJoinColumn(name="dexNumber")
//	})
public class PokemonForm implements Serializable{
	@Id
	@Column(nullable=false, name="dexNumber")
	private Integer dexNumber;
	@Id
	@Column(nullable=false)
	private String formName;
	private Integer generation;
	private String species;
	private Double height;
	private Double weight;
	private Integer statTotal;
	private Integer hP;
	private Integer attack;
	private Integer defense;
	private Integer specialAttack;
	private Integer specialDefense;
	private Integer speed;
	private Double percentMale;
	
//	@Id
	@ManyToOne
//	@JoinColumn (name="dexNumber", insertable=false, updatable=false)
	private Pokemon pokemon;
	
	public PokemonForm() {}

	public PokemonForm(Integer dexNumber, String formName, Integer generation, String species,
			Double height, Double weight, Integer statTotal, Integer hP, Integer attack,
			Integer defense, Integer specialAttack, Integer specialDefense, Integer speed,
			Double percentMale) {
		this.dexNumber=dexNumber;
		this.formName=formName;
		this.generation=generation;
		this.species=species;
		this.height=height;
		this.weight=weight;
		this.statTotal=statTotal;
		this.hP=hP;
		this.attack=attack;
		this.defense=defense;
		this.specialAttack=specialAttack;
		this.specialDefense=specialDefense;
		this.speed=speed;
		this.percentMale=percentMale;
	}

	public Integer getDexNumber() {
		return dexNumber;
	}

	public void setDexNumber(Integer dexNumber) {
		this.dexNumber = dexNumber;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Integer getGeneration() {
		return generation;
	}

	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getStatTotal() {
		return statTotal;
	}

	public void setStatTotal(Integer statTotal) {
		this.statTotal = statTotal;
	}

	public Integer gethP() {
		return hP;
	}

	public void sethP(Integer hP) {
		this.hP = hP;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}

	public Integer getSpecialDefense() {
		return specialDefense;
	}

	public void setSpecialDefense(Integer specialDefense) {
		this.specialDefense = specialDefense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Double getPercentMale() {
		return percentMale;
	}

	public void setPercentMale(Double percentMale) {
		this.percentMale = percentMale;
	}

}
