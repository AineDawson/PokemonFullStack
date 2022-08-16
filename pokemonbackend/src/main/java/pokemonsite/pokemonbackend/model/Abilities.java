package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="abilities")
public class Abilities implements Serializable{
	@Id
	private String abilityName;
	private String abilityDescription;
	private Integer generation;

	public Abilities() {
		// TODO Auto-generated constructor stub
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getDescription() {
		return abilityDescription;
	}

	public void setDescription(String description) {
		this.abilityDescription = description;
	}

	public Integer getGeneration() {
		return generation;
	}

	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

}
