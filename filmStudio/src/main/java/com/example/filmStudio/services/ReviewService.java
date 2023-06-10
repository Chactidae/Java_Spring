package com.example.filmStudio.services;

import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import com.example.filmStudio.models.Review;
import com.example.filmStudio.repositories.AuthorRepository;
import com.example.filmStudio.repositories.ReviewRepos;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepos reviewRepos;
    public List<Review> list() {
        return reviewRepos.findAllReview();
    }
    public void createReview(Review review){
        reviewRepos.createReview(review.getNickname(), review.getRating(), review.getReview());
    }
}
