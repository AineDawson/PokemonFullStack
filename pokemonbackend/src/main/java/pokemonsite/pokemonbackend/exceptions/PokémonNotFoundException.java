package pokemonsite.pokemonbackend.exceptions;

public class PokémonNotFoundException extends RuntimeException{
	public PokémonNotFoundException(String message) {
		super(message);
	}
}
