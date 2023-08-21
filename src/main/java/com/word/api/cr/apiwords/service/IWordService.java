package com.word.api.cr.apiwords.service;

import com.word.api.cr.apiwords.domain.Word;

public interface IWordService {
    
    public Word getWord();
    public Word getWordByLength(int length);

}
