package com.example.notes.application;

import com.example.notes.domain.model.Note;
import com.example.notes.domain.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepository notesRepository;

    public String createNote(){
        Note note = new Note();
        note.setContent("content");
        note.setTitle("title");
        notesRepository.save(note);
        return "Note created";
    }

    public List<Note> getNotes() {
        return notesRepository.findAll();
    }
}
