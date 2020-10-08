import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Sentence } from '../models/sentence';

@Injectable({
  providedIn: 'root'
})
export class SentenceService {
  private url = 'http://localhost:8081/';
  constructor(private http: HttpClient) { }

  addSentence(sentence: Sentence) { 
    return this.http.post<Sentence>(this.url + '/sentence', sentence);
  }

  getRandomSentence() {
    return this.http.get<Sentence>(this.url + '/sentence/random');
  }
}
