package com.example.filmStudio.repositories;

import com.example.filmStudio.models.Film;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface FilmRepository extends JpaRepository<Film, Long> {
    @Query(value = "SELECT * FROM film WHERE film.f_name = :f_name",
            nativeQuery = true)
    List<Film> findByFname(@Param("f_name") String f_name);
    @Query(value = "SELECT * FROM film ORDER BY film_id DESC LIMIT 10",
            nativeQuery = true)
    List<Film> findAllFilms();

    @Query(value = "DELETE FROM film WHERE film.film_id = :id",
            nativeQuery = true)
    List<Film> deleteByIdFilm(@Param("id") Long id);

    @Modifying
    @Query(value = "INSERT INTO film (trailer, f_name, cover, duration, film_info_id, review_id, author_id, artist_id) VALUES" +
            " (:trailer, :f_name, :cover, :duration, :film_info_id, :review_id, :author_id, :artist_id)",
            nativeQuery = true)
    void createFilm(@Param("trailer") String trailer, @Param("f_name") String f_name, @Param("cover") String cover, @Param("duration") Integer duration, @Param("film_info_id") Integer film_info_id,
                    @Param("review_id") Integer review_id, @Param("author_id") Integer author_id, @Param("artist_id") Integer artist_id);

    @Query(value = "SELECT author_id FROM film WHERE film.film_id = :id",
            nativeQuery = true)
    Long findAuthor(@Param("id") Long id);

    @Query(value = "SELECT film_info_id FROM film WHERE film.film_id = :id",
            nativeQuery = true)
    Long findInfo(@Param("id") Long id);

    @Modifying
    @Query(value = "UPDATE film SET trailer = :trailer, f_name = :f_name, cover = :cover, duration = :duration, film_info_id = :film_info_id, review_id = :review_id, author_id = :author_id, artist_id = :artist_id WHERE film_id = :id",
            nativeQuery = true)
    void updateFilm(@Param("id") Long id, @Param("trailer") String trailer, @Param("f_name") String f_name, @Param("cover") String cover, @Param("duration") Integer duration, @Param("film_info_id") Integer film_info_id,
                    @Param("review_id") Integer review_id, @Param("author_id") Integer author_id, @Param("artist_id") Integer artist_id);

    @Query(value = "SELECT film.f_name, film_info.country, film_info.release_date, film_info.premiere_info, film_info.copyright_id, author.fio" +
            "FROM film" +
            "LEFT JOIN author ON film.author_id = author.author_id" +
            "LEFT JOIN film_info ON film.film_info_id = film_info.film_info_id" +
            "WHERE f_name = :f_name",
            nativeQuery = true)
    String req1Try(@Param("f_name") String f_name);




}