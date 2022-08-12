package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pokemonformtypes")
public class PokemonFormTypes implements Serializable{
	@Id
	@Column(nullable=false)
	private Integer dexNumber;
	@Id
	@Column(nullable=false)
	private String formName;
	private Integer typeIndex;

	public PokemonFormTypes() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTypeIndex() {
		return typeIndex;
	}

	public void setTypeIndex(Integer typeIndex) {
		this.typeIndex = typeIndex;
	}

}
