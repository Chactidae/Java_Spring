package com.example.filmStudio.services;


import com.example.filmStudio.models.Artist;
import com.example.filmStudio.models.Author;
import com.example.filmStudio.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ArtistService {
    private final ArtistRepository artistRepository;

    public List<Artist> list() {
        return artistRepository.findAllArtists();
    }
    public List<Artist> listAge(Integer age) {
        if (age != null) return artistRepository.findByAge(age);
        return artistRepository.findAllArtists();
    }

}
