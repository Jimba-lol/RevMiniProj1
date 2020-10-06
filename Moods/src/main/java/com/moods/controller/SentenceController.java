package com.moods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moods.model.Sentence;
import com.moods.service.SentenceService;

@RestController
public class SentenceController {
	private SentenceService service;
	
	@Autowired
	public SentenceController(SentenceService service) {
		this.service = service;
	}
	
	// Create
	@PostMapping("/sentence")
	public Sentence createSentence(Sentence s) {
		return service.saveSentence(s);
	}
	
	// Get Random
	@GetMapping("/sentence/random")
	public Sentence readSentenceRandom() {
		return service.readRandomSentence();
	}
}
