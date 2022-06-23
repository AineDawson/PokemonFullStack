package pokemonsite.pokemonbackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pokemonsite.pokemonbackend.model.Pokémon;

public interface PokémonRepo extends JpaRepository<Pokémon, Integer>{
	//Created automatically by Spring based on name
	//Optional prevents the query from flat out failing if no Pokémon is found
	Optional<Pokémon> findPokémonByIndexNumber(Integer indexNumber);
}
