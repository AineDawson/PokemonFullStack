package pokemonsite.pokemonbackend.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="types")
public class Types implements Serializable{
	@Id
	private Integer typeIndex;
	private String typeName;

	public Types() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Integer getTypeIndex() {
		return typeIndex;
	}

	public void setTypeIndex(Integer typeIndex) {
		this.typeIndex = typeIndex;
	}

	public String getType() {
		return typeName;
	}

	public void setType(String type) {
		this.typeName = type;
	}

}
