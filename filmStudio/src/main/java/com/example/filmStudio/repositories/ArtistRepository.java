package com.example.filmStudio.repositories;


import com.example.filmStudio.models.Artist;
import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    @Query(value = "SELECT * FROM artist",
            nativeQuery = true)
    List<Artist> findAllArtists();

    @Query(value = "SELECT * FROM artist WHERE artist.age < :age",
            nativeQuery = true)
    List<Artist> findByAge(@Param("age") Integer age);

    int countAllByAge(Integer age);
}
