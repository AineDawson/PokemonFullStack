package pokemonsite.pokemonbackend;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pokemonsite.pokemonbackend.exceptions.PokémonImageNotFoundException;
import pokemonsite.pokemonbackend.model.PokemonForm;
import pokemonsite.pokemonbackend.service.PokémonService;

//Handles all incoming HTTP requests
//The Controller of the API

@RestController
@RequestMapping("/pokémon")
public class PokémonController {
	private final PokémonService pokémonService;
	
	public PokémonController(PokémonService pokémonService) {
		this.pokémonService=pokémonService;
	}
	
//	//Retrieves every pokémon in the database
//	@GetMapping("/all")
//	public ResponseEntity<List<PokemonForm>> getAllPokémon(){
//		List<PokemonForm> pokémon=pokémonService.findAllPokémon();
//		return new ResponseEntity<>(pokémon, HttpStatus.OK);
//	}
	
	//Retrieves every pokémonform in the database
		@GetMapping("/allforms")
		public ResponseEntity<List<PokemonForm>> getPokemonForms(){
			List<PokemonForm> pokémon=pokémonService.getPokemonForms();
			return new ResponseEntity<>(pokémon, HttpStatus.OK);
		}
	
	//Locates pokémon based off of their index number
	@GetMapping("/find/{formName}")
	public ResponseEntity<PokemonForm> getPokemonForm(@PathVariable("formName") String formName){
		PokemonForm pokémon=pokémonService.findPokemonForm(formName);
		return new ResponseEntity<>(pokémon, HttpStatus.OK);
	}
	
	@GetMapping(value="/image/{name}", produces="images/png")
	public @ResponseBody byte[] getPokémonImageByName(@PathVariable("name") String name){
		try {
	        // Retrieve image from the classpath.

	        // Prepare buffered image.
	        BufferedImage img = ImageIO.read(new FileInputStream("Images/PokemonImages/"+name.toLowerCase()+".png"));

	        // Create a byte array output stream.
	        ByteArrayOutputStream bao = new ByteArrayOutputStream();

	        // Write to output stream
	        ImageIO.write(img, "png", bao);

	        return bao.toByteArray();
	    } catch (IOException e) {
	        throw new PokémonImageNotFoundException("Image of "+name+" was not found");
	    }
	}
}
