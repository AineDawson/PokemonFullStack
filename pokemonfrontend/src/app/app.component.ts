import { Component, OnInit } from '@angular/core';
import { Pokémon } from './pokemon';
import { PokemonService } from './pokemon.service';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public pokemonAll!:Pokémon[];
  public pokemonDisplayed!: Pokémon[];
  // title = 'pokemonfrontend';

  constructor(private pokemonService: PokemonService){}

  ngOnInit() {
    this.getPokemon();
  }

  public getPokemon(): void {
    this.pokemonService.getPokémon().subscribe(
      (response: Pokémon[]) => {
        this.pokemonAll = response;
        this.pokemonDisplayed=this.pokemonAll;
        console.log(this.pokemonDisplayed);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
