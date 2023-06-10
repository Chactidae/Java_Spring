package com.example.filmStudio.services;

import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import com.example.filmStudio.repositories.AuthorRepository;
import com.example.filmStudio.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class FilmService{
    private final FilmRepository filmRepository;

    public List<Film> list(String f_name) {

        if (f_name != null) return filmRepository.findByFname(f_name);
        return filmRepository.findAllFilms();
    }

    public void saveFilm(Film film){
        log.info("Saving new {}", film);
        filmRepository.save(film);
    }

    public void showFilm(Film film){
        filmRepository.findByFname(String.valueOf(film));
    }

    public void deleteFilm(Long id){
        filmRepository.deleteById(id);
    }

    public void createFilm(Film film){
        filmRepository.createFilm(film.getTrailer(), film.getF_name(), film.getCover(), film.getDuration(), film.getFilm_info_id(), film.getReview_id(),
                                  film.getAuthor(), film.getArtist_id());
    }

    public Film getFilmById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }
    public Long getIdAuthor(Long id) {
        return filmRepository.findAuthor(id);
    }
    public Long getIdInfo(Long id) {
        return filmRepository.findInfo(id);
    }

    public void updateFilm(Film film, Long id){
        filmRepository.updateFilm(id, film.getTrailer(), film.getF_name(), film.getCover(), film.getDuration(), film.getFilm_info_id(), film.getReview_id(),
                                        film.getAuthor(), film.getArtist_id());
    }


}
