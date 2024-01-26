package com.example.notes.domain.repository;

import com.example.notes.domain.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long> {
}
