package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="typematchups")
public class TypeMatchups implements Serializable{
	@Id
	private String attackType;
	@Id
	private String defenseType;
	private Double modifier;

	public TypeMatchups() {
		// TODO Auto-generated constructor stub
	}


	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public String getDefenseType() {
		return defenseType;
	}

	public void setDefenseType(String defenseType) {
		this.defenseType = defenseType;
	}

	public Double getModifier() {
		return modifier;
	}

	public void setModifier(Double modifier) {
		this.modifier = modifier;
	}

}
