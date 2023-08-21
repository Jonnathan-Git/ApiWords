package com.word.api.cr.apiwords.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.word.api.cr.apiwords.data.WordServiceJpa;
import com.word.api.cr.apiwords.domain.Word;

@RestController
@RequestMapping("/api/word/v1")
public class WordController {
    @Autowired
    private WordServiceJpa wordServiceJpa;

    @GetMapping("/random-word")
    @ResponseBody
    public Word getWord() {
        return wordServiceJpa.getWord();
    }
    
}
