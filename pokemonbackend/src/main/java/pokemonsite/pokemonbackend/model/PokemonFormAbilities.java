package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pokemonformabilities")
public class PokemonFormAbilities implements Serializable{
	@Id
	private Integer dexNumber;
	@Id
	private String formName;
	@Id
	private Integer abilityIndex;

	public PokemonFormAbilities() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public Integer getAbilityIndex() {
		return abilityIndex;
	}

	public void setAbilityIndex(Integer abilityIndex) {
		this.abilityIndex = abilityIndex;
	}

}
