package pokemonsite.pokemonbackend.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pokemonsite.pokemonbackend.model.PokemonForm;

@Repository
public interface PokémonRepo extends JpaRepository<PokemonForm, Integer>{
//	@Query("select a from PokemonForm a where a.formName= !1")
//	public PokemonForm getPokemonForm(Integer dexNumber, String formName);
	//Created automatically by Spring based on name
	//Optional prevents the query from flat out failing if no Pokémon is found
	Optional<PokemonForm> findPokemonFormByDexNumberAndFormName(Integer dexNumber, String formName);
}
