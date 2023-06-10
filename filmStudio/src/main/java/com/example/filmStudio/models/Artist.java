package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "artist")
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artist_id")
    private Long id;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "fio")
    private String fio;
    @Column(name = "age")
    private int age;

    public Long getId() {
        return this.id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFio() {
        return this.fio;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Artist)) return false;
        final Artist other = (Artist) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$avatar = this.getAvatar();
        final Object other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) return false;
        final Object this$fio = this.getFio();
        final Object other$fio = other.getFio();
        if (this$fio == null ? other$fio != null : !this$fio.equals(other$fio)) return false;
        if (this.getAge() != other.getAge()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Artist;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $avatar = this.getAvatar();
        result = result * PRIME + ($avatar == null ? 43 : $avatar.hashCode());
        final Object $fio = this.getFio();
        result = result * PRIME + ($fio == null ? 43 : $fio.hashCode());
        result = result * PRIME + this.getAge();
        return result;
    }

    public String toString() {
        return "Artist(id=" + this.getId() + ", avatar=" + this.getAvatar() + ", fio=" + this.getFio() + ", age=" + this.getAge() + ")";
    }
}
