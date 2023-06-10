package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "review")
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Long id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "review")
    private String review;
    @Column(name = "rating")
    private int rating;

    public Long getId() {
        return this.id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getReview() {
        return this.review;
    }

    public int getRating() {
        return this.rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Review)) return false;
        final Review other = (Review) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nickname = this.getNickname();
        final Object other$nickname = other.getNickname();
        if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname)) return false;
        final Object this$review = this.getReview();
        final Object other$review = other.getReview();
        if (this$review == null ? other$review != null : !this$review.equals(other$review)) return false;
        if (this.getRating() != other.getRating()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Review;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nickname = this.getNickname();
        result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
        final Object $review = this.getReview();
        result = result * PRIME + ($review == null ? 43 : $review.hashCode());
        result = result * PRIME + this.getRating();
        return result;
    }

    public String toString() {
        return "Review(id=" + this.getId() + ", nickname=" + this.getNickname() + ", review=" + this.getReview() + ", rating=" + this.getRating() + ")";
    }
}
