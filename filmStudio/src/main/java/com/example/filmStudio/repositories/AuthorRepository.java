package com.example.filmStudio.repositories;

import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(value = "SELECT * FROM author",
            nativeQuery = true)
    List<Author> findAllAuthors();

    @Query(value = "SELECT fio FROM author WHERE author_id = :id",
            nativeQuery = true)
    List<Author> findAuthor(@Param("id") Long id);

    @Modifying
    @Query(value = "INSERT INTO author (avatar, fio, age) VALUES" +
            " (:avatar, :fio, :age)",
            nativeQuery = true)
    void createAuthor(@Param("avatar") String avatar, @Param("fio") String fio, @Param("age") Integer age);

    @Modifying
    @Query(value = "UPDATE author SET avatar = :avatar, fio = :fio, age = :age WHERE author_id = :id",
            nativeQuery = true)
    void updateAuthor(@Param("id") Long id, @Param("avatar") String avatar, @Param("fio") String fio, @Param("age") Integer age);

}
