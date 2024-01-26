package com.example.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/notes")
public class ControllerNotes {


    @GetMapping
    public String getNotes() {
        return "Notes";
    }

    @PostMapping
    public String postNotes() {
        return "Notes";
    }

}
