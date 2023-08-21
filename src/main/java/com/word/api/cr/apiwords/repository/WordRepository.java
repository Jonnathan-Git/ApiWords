package com.word.api.cr.apiwords.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.word.api.cr.apiwords.domain.Word;

public interface WordRepository extends JpaRepository<Word, Integer> {

    @Query(nativeQuery = true, value = "SELECT * " +
            "FROM word " +
            "ORDER BY RAND() " +
            "LIMIT 1")
    Word findRandomWord();

}
