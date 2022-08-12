package pokemonsite.pokemonbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pokemonsite.pokemonbackend.exceptions.PokémonNotFoundException;
import pokemonsite.pokemonbackend.model.PokemonForm;
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
	public List<PokemonForm> findAllPokémon(){
		return pokémonRepo.findAll();
	}
	
	public List<PokemonForm> getPokemonForms() {
		return pokémonRepo.getAllPokemonForms();
				}
	//Created 
	public PokemonForm findPokemonForm( String formName) {
		return pokémonRepo.findPokemonFormByFormName(formName).
				orElseThrow(() -> new PokémonNotFoundException("Pokemon with name "+formName +" was not found"));
	}
}
