package pokemonsite.pokemonbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pokemonsite.pokemonbackend.exceptions.PokémonNotFoundException;
import pokemonsite.pokemonbackend.model.Pokémon;
import pokemonsite.pokemonbackend.repo.PokémonRepo;

@Service
@Transactional
public class PokémonService {
	private final PokémonRepo pokémonRepo;
	
	@Autowired
	public PokémonService(PokémonRepo pokémonRepo) {
		this.pokémonRepo=pokémonRepo;
	}
	
	//provided by JpaRepository
	public List<Pokémon> findAllPokémon(){
		return pokémonRepo.findAll();
	}
	//Created 
	public Pokémon findPokémonByIndexNumber(Integer indexNumber) {
		return pokémonRepo.findPokémonByIndexNumber(indexNumber).
				orElseThrow(() -> new PokémonNotFoundException("User by id "+indexNumber+" was not found"));
	}
}
