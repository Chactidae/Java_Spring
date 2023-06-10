package com.example.filmStudio.services;

import com.example.filmStudio.models.Account;
import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import com.example.filmStudio.repositories.AuthorRepository;
import com.example.filmStudio.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    public List<Author> list() {
        return authorRepository.findAllAuthors();
    }
    public Author findById(Long id){
        return authorRepository.findById(id).orElse(null);
    }

    public void createAuthor(Author author){
        authorRepository.createAuthor(author.getAvatar(), author.getFio(), author.getAge());
    }
    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }

    public void updateAuthor(Author author, Long id){
        authorRepository.updateAuthor(id, author.getAvatar(), author.getFio(), author.getAge());
    }

}