/**
 * This Controller is meant to be used to initialize 15 default moods and 15 default sentences
 * upon app startup.
 */

package com.moods.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moods.model.Mood;
import com.moods.model.Sentence;
import com.moods.service.MoodService;
import com.moods.service.SentenceService;

@RestController
public class DevController {
	private MoodService ms;
	private SentenceService ss;
	
	@Autowired
	public DevController(MoodService ms, SentenceService ss) {
		this.ms = ms;
		this.ss = ss;
	}
	
	@GetMapping("/dev/init")
	public String init() {
		List<Mood> moods = new ArrayList<>();
		List<Sentence> sentences = new ArrayList<>();
		
		moods.add(new Mood("Happy"));
		moods.add(new Mood("Sad"));
		moods.add(new Mood("Angry"));
		moods.add(new Mood("Elated"));
		moods.add(new Mood("Excited"));
		moods.add(new Mood("Ecstatic"));
		moods.add(new Mood("Confused"));
		moods.add(new Mood("Perplexed"));
		moods.add(new Mood("Joyful"));
		moods.add(new Mood("Surprised"));
		moods.add(new Mood("Tired"));
		moods.add(new Mood("Sleepy"));
		moods.add(new Mood("Mellow"));
		moods.add(new Mood("Calm"));
		moods.add(new Mood("Relaxed"));
		
		sentences.add(new Sentence("Want fries with that?"));
		sentences.add(new Sentence("Does Jax eat snacks by the tracks?"));
		sentences.add(new Sentence("I do my own stunts."));
		sentences.add(new Sentence("I have a lot of laundry to do today."));
		sentences.add(new Sentence("I can break these cuffs."));
		sentences.add(new Sentence("I have a flight tomorrow."));
		sentences.add(new Sentence("I need to run to the store real quick."));
		sentences.add(new Sentence("If I had a nickel for every time I heard that, I'd have 2 nickels."));
		sentences.add(new Sentence("It all began on the day of my actual birth - Both of my parents failed to show up."));
		sentences.add(new Sentence("Well that kind of ruined the moment."));
		sentences.add(new Sentence("Yeah, whatever."));
		sentences.add(new Sentence("Basically, my parents disowned me; I was being raised by ocelots."));
		sentences.add(new Sentence("Why are we still here, just to suffer?"));
		sentences.add(new Sentence("You know, it's the technical side of evil that people don't really appreciate."));
		sentences.add(new Sentence("This macaroni and cheese isn't tasty."));
		
		for (Mood mood : moods) {
			ms.saveMood(mood);
		}
		for (Sentence sentence : sentences) {
			ss.saveSentence(sentence);
		}
		
		return "Generated.";
	}
	
}
