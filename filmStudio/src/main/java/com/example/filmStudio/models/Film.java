package com.example.filmStudio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film")
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "film_id")
    private Long id;
    @Column(name = "f_name")
    private String f_name;
    @Column(name = "duration")
    private int duration;
    @Column(name = "author_id")
    private int author;
    @Column(name = "trailer")
    private String trailer;
    @Column(name = "cover")
    private String cover;
    @Column(name = "film_info_id")
    private int film_info_id;
    @Column(name = "review_id")
    private int review_id;
    @Column(name = "artist_id")
    private int artist_id;


    public Long getId() {
        return this.id;
    }

    public String getF_name() {
        return this.f_name;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getAuthor() {
        return this.author;
    }

    public String getTrailer() {
        return this.trailer;
    }

    public String getCover() {
        return this.cover;
    }

    public int getFilm_info_id() {
        return this.film_info_id;
    }

    public int getReview_id() {
        return this.review_id;
    }

    public int getArtist_id() {
        return this.artist_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setFilm_info_id(int film_info_id) {
        this.film_info_id = film_info_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Film)) return false;
        final Film other = (Film) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$f_name = this.getF_name();
        final Object other$f_name = other.getF_name();
        if (this$f_name == null ? other$f_name != null : !this$f_name.equals(other$f_name)) return false;
        if (this.getDuration() != other.getDuration()) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        final Object this$trailer = this.getTrailer();
        final Object other$trailer = other.getTrailer();
        if (this$trailer == null ? other$trailer != null : !this$trailer.equals(other$trailer)) return false;
        final Object this$cover = this.getCover();
        final Object other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) return false;
        if (this.getFilm_info_id() != other.getFilm_info_id()) return false;
        if (this.getReview_id() != other.getReview_id()) return false;
        if (this.getArtist_id() != other.getArtist_id()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Film;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $f_name = this.getF_name();
        result = result * PRIME + ($f_name == null ? 43 : $f_name.hashCode());
        result = result * PRIME + this.getDuration();
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $trailer = this.getTrailer();
        result = result * PRIME + ($trailer == null ? 43 : $trailer.hashCode());
        final Object $cover = this.getCover();
        result = result * PRIME + ($cover == null ? 43 : $cover.hashCode());
        result = result * PRIME + this.getFilm_info_id();
        result = result * PRIME + this.getReview_id();
        result = result * PRIME + this.getArtist_id();
        return result;
    }

    public String toString() {
        return "Film(id=" + this.getId() + ", f_name=" + this.getF_name() + ", duration=" + this.getDuration() + ", author=" + this.getAuthor() + ", trailer=" + this.getTrailer() + ", cover=" + this.getCover() + ", film_info_id=" + this.getFilm_info_id() + ", review_id=" + this.getReview_id() + ", artist_id=" + this.getArtist_id() + ")";
    }

}
