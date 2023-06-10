package com.example.filmStudio.repositories;


import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film_info;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface InfoRepository extends JpaRepository<Film_info, Long> {
    @Query(value = "SELECT * FROM film_info WHERE film_info_id = :id",
            nativeQuery = true)
    List<Film_info> findInfo(@Param("id") Long id);
}
