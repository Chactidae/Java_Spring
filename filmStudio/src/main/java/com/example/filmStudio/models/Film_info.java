package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "film_info")
@AllArgsConstructor
@NoArgsConstructor
public class Film_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "film_info_id")
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "country")
    private String country;
    @Column(name = "release_date")
    private Date release_date;
    @Column(name = "premiere_info")
    private String premiere_info;
    @Column(name = "copyright_id")
    private String copyright_id;

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCountry() {
        return this.country;
    }

    public Date getRelease_date() {
        return this.release_date;
    }

    public String getPremiere_info() {
        return this.premiere_info;
    }

    public String getCopyright_id() {
        return this.copyright_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public void setPremiere_info(String premiere_info) {
        this.premiere_info = premiere_info;
    }

    public void setCopyright_id(String copyright_id) {
        this.copyright_id = copyright_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Film_info)) return false;
        final Film_info other = (Film_info) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$release_date = this.getRelease_date();
        final Object other$release_date = other.getRelease_date();
        if (this$release_date == null ? other$release_date != null : !this$release_date.equals(other$release_date))
            return false;
        final Object this$premiere_info = this.getPremiere_info();
        final Object other$premiere_info = other.getPremiere_info();
        if (this$premiere_info == null ? other$premiere_info != null : !this$premiere_info.equals(other$premiere_info))
            return false;
        final Object this$copyright_id = this.getCopyright_id();
        final Object other$copyright_id = other.getCopyright_id();
        if (this$copyright_id == null ? other$copyright_id != null : !this$copyright_id.equals(other$copyright_id))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Film_info;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $release_date = this.getRelease_date();
        result = result * PRIME + ($release_date == null ? 43 : $release_date.hashCode());
        final Object $premiere_info = this.getPremiere_info();
        result = result * PRIME + ($premiere_info == null ? 43 : $premiere_info.hashCode());
        final Object $copyright_id = this.getCopyright_id();
        result = result * PRIME + ($copyright_id == null ? 43 : $copyright_id.hashCode());
        return result;
    }

    public String toString() {
        return "Film_info(id=" + this.getId() + ", description=" + this.getDescription() + ", country=" + this.getCountry() + ", release_date=" + this.getRelease_date() + ", premiere_info=" + this.getPremiere_info() + ", copyright_id=" + this.getCopyright_id() + ")";
    }
}
