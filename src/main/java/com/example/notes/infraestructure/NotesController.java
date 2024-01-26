package com.example.notes.infraestructure;

import com.example.notes.application.NotesService;
import com.example.notes.domain.model.Note;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
@CrossOrigin
@Tag(name = "Notes", description = "The Notes API")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping
    @Operation(summary = "Get all notes")
    public List<Note> getNotes() {
        return notesService.getNotes();
    }

    @PostMapping
    @Operation(summary = "Create a note")
    public String createNotes() {
        return notesService.createNote();
    }

}
