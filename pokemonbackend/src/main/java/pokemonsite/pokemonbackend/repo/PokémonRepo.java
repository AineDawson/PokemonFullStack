package pokemonsite.pokemonbackend.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pokemonsite.pokemonbackend.model.PokemonForm;

@Repository
public interface PokémonRepo extends JpaRepository<PokemonForm, Integer>{
	@Query("select a from PokemonForm a inner join a.pokemon p")
	public List<PokemonForm> getAllPokemonForms();
	//Created automatically by Spring based on name
	//Optional prevents the query from flat out failing if no Pokémon is found
	Optional<PokemonForm> findPokemonFormByFormName(String formName);
	
//	@Query("select p from PokemonForm p where p.dexNumber=?1 and p.formName=?2")
//	Optional<PokemonForm> findPokemonFormByDexNumberAndFormName(Integer dexNumber, String formName);
}
