import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mood } from '../models/mood';

@Injectable({
  providedIn: 'root'
})
export class MoodService {
  private url = 'http://localhost:8081/'
  constructor(private http: HttpClient) { }

  addMood(mood: Mood) {
    mood.data = mood.data.toLowerCase();
    return this.http.post<Mood>(this.url + '/mood', mood);
  }

  getRandomMood() {
    return this.http.get<Mood>(this.url + '/mood/random');
  }
}
