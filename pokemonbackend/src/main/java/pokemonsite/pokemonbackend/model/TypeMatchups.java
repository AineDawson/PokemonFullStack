package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="typematchups")
public class TypeMatchups implements Serializable{
	@Id
	private Integer attackTypeIndex;
	@Id
	private Integer defenseTypeIndex;
	private Double modifier;

	public TypeMatchups() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Integer getAttackTypeIndex() {
		return attackTypeIndex;
	}

	public void setAttackTypeIndex(Integer attackTypeIndex) {
		this.attackTypeIndex = attackTypeIndex;
	}

	public Integer getDefenseTypeIndex() {
		return defenseTypeIndex;
	}

	public void setDefenseTypeIndex(Integer defenseTypeIndex) {
		this.defenseTypeIndex = defenseTypeIndex;
	}

	public Double getModifier() {
		return modifier;
	}

	public void setModifier(Double modifier) {
		this.modifier = modifier;
	}

}
