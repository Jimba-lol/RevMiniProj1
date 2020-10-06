package com.moods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moods.model.Mood;
import com.moods.service.MoodService;

@RestController
public class MoodController {
	private MoodService service;
	
	@Autowired
	public MoodController(MoodService service) {
		this.service = service;
	}
	
	// Create
	@PostMapping("/mood")
	public Mood createMood(Mood mood) {
		return service.saveMood(mood);
	}
	
	// Get Random
	@GetMapping("/mood/random")
	public Mood readMoodRandom() {
		return service.readRandomMood();
	}
}
