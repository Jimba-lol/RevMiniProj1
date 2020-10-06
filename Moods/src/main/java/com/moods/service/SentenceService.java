/**
 * Sentence Service.
 * Communicates with Sentence Repository.
 */

package com.moods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.moods.model.Sentence;
import com.moods.repo.SentenceRepo;

@Service
public class SentenceService {
	SentenceRepo repo;
	
	@Autowired
	public SentenceService(SentenceRepo repo) {
		this.repo = repo;
	}
	
	// Create
	public Sentence saveSentence(Sentence s) {
		return repo.save(s);
	}
	
	// Get Random
	public Sentence readRandomSentence() {
		long count = repo.count();
		int index = (int)(Math.random() * count);
		Page<Sentence> page = repo.findAll(PageRequest.of(index, 1));
		Sentence ret = null;
		if (page.hasContent()) {
			ret = page.getContent().get(0);
		}
		return ret;
	}
}
