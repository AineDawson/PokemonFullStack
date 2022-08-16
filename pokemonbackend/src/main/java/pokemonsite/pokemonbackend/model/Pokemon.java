package pokemonsite.pokemonbackend.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon implements Serializable{
	@Id
	@Column(nullable=false)
	private Integer dexNumber;
	@Column(nullable=false)
	private String pokemonName;
	@Column(nullable=false)
	private String legendStatus;
	private Integer catchRate;
	private Integer baseFriendship;
	private String growthRate;
	
	@OneToMany(targetEntity=PokemonForm.class, cascade=CascadeType.ALL) 
	@JoinColumn(name="dexNumber", referencedColumnName="dexNumber")
	private List<PokemonForm> pokemonForm;
	
	public Pokemon() {}
	
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
	public String getStatus() {
		return legendStatus;
	}
	public void setStatus(String status) {
		this.legendStatus = status;
	}
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

