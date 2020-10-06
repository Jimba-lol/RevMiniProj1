package com.moods.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moods.model.Sentence;

@Repository
public interface SentenceRepo extends JpaRepository<Sentence, Integer> {
	long count();
	Page<Sentence> findAll(Pageable pageable);
}