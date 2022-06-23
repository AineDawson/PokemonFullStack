import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pokémon } from './pokemon';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {
  private apiServerUrl = environment.apiBaseUrl;
  httpClient: any;

  constructor(private http: HttpClient){}  

  public getPokémon(): Observable<Pokémon[]> {
    return this.http.get<Pokémon[]>(`${this.apiServerUrl}/pokémon/all`);
  }

  // public getPokémonImage(indexNumber: number): Observable<void> {
  //   return this.http.get<void>(`${this.apiServerUrl}/pokémon/image/${indexNumber}`, { responseType: Response })
  //   .map((res: Response) => res.blob());;
  // }

  public getPokémonImage(indexNumber: number): Observable<Blob> {
    return this.http.get(`${this.apiServerUrl}/pokémon/image/${indexNumber}`, { responseType: 'blob' });
  }
}
