/**
 * Mood Service.
 * Communicates with Mood Repository.
 */

package com.moods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.moods.model.Mood;
import com.moods.repo.MoodRepo;

@Service
public class MoodService {
	MoodRepo repo;
	
	@Autowired
	public MoodService(MoodRepo repo) {
		this.repo = repo;
	}
	
	// Create
	public Mood saveMood(Mood mood) {
		return repo.save(mood);
	}
	
	// Get Random
	public Mood readRandomMood() {
		long count = repo.count();
		int index = (int)(Math.random() * count);
		Page<Mood> page = repo.findAll(PageRequest.of(index, 1));
		Mood ret = null;
		if (page.hasContent()) {
			ret = page.getContent().get(0);
		}
		return ret;
	}
}
