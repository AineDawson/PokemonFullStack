package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@IdClass(PokemonFormId.class)
@Table(name="pokemonformabilities")
public class PokemonFormAbilities implements Serializable{
	@Id
	@Column(nullable=false)
	private Integer dexNumber;
	@Id
	@Column(nullable=false)
	private String formName;
	private String ability1;
	private String ability2;
	private String ability3;
	
	public PokemonFormAbilities() {
		// TODO Auto-generated constructor stub
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

	public String getAbility1() {
		return ability1;
	}

	public void setAbility1(String ability1) {
		this.ability1 = ability1;
	}
	public String getAbility2() {
		return ability2;
	}

	public void setAbility2(String ability2) {
		this.ability2 = ability2;
	}
	public String getAbility3() {
		return ability3;
	}

	public void setAbilityHidden(String ability3) {
		this.ability3 = ability3;
	}
}