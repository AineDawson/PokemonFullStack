package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@IdClass(PokemonFormId.class)
@Table(name="pokemonformtypes")
public class PokemonFormTypes implements Serializable{
	@Id
	@Column(nullable=false)
	private Integer dexNumber;
	@Id
	@Column(nullable=false)
	private String formName;
	private String type1;
	private String type2;

	public PokemonFormTypes() {
		// TODO Auto-generated constructor stub
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}
	
	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

}
