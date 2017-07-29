package com.arielcrodriguez.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arielcrodriguez.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> { }