package com.moods.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moods.model.Mood;

@Repository
public interface MoodRepo extends JpaRepository<Mood, Integer> {
	long count();
	Page<Mood> findAll(Pageable pageable);
}