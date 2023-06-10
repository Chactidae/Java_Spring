package com.example.filmStudio.repositories;

import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import com.example.filmStudio.models.Review;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ReviewRepos extends JpaRepository<Review, Long> {
    @Query(value = "SELECT * FROM review",
            nativeQuery = true)
    List<Review> findAllReview();

    @Modifying
    @Query(value = "INSERT INTO review (nickname, rating, review) VALUES" +
            " (:nickname, :rating, :review)",
            nativeQuery = true)
    void createReview(@Param("nickname") String nickname, @Param("rating") Integer rating, @Param("review") String review);
}
