package com.word.api.cr.apiwords.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.word.api.cr.apiwords.domain.Word;
import com.word.api.cr.apiwords.repository.WordRepository;
import com.word.api.cr.apiwords.service.IWordService;

@Service
@Primary
public class WordServiceJpa implements IWordService{

    @Autowired
    private WordRepository wordRepository;

    @Override
    public Word getWord() {
        return wordRepository.findRandomWord();
    }

    @Override
    public Word getWordByLength(int length) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWordByLength'");
    }
    
}
