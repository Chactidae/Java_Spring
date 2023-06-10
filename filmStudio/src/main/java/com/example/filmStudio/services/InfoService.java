package com.example.filmStudio.services;


import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film_info;
import com.example.filmStudio.repositories.InfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InfoService {
    private final InfoRepository infoRepository;
    public Film_info findById(Long id){
        return infoRepository.findById(id).orElse(null);
    }


}
