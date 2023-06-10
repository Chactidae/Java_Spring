package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "access_level")
    private String access_level;
    @Column(name = "user_record_id")
    private int user_record_id;
    @Column(name = "cart_id")
    private int cart_id;


    public Long getId() {
        return this.id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAccess_level() {
        return this.access_level;
    }

    public int getUser_record_id() {
        return this.user_record_id;
    }

    public int getCart_id() {
        return this.cart_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAccess_level(String access_level) {
        this.access_level = access_level;
    }

    public void setUser_record_id(int user_record_id) {
        this.user_record_id = user_record_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Account)) return false;
        final Account other = (Account) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nickname = this.getNickname();
        final Object other$nickname = other.getNickname();
        if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname)) return false;
        final Object this$avatar = this.getAvatar();
        final Object other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) return false;
        final Object this$access_level = this.getAccess_level();
        final Object other$access_level = other.getAccess_level();
        if (this$access_level == null ? other$access_level != null : !this$access_level.equals(other$access_level))
            return false;
        if (this.getUser_record_id() != other.getUser_record_id()) return false;
        if (this.getCart_id() != other.getCart_id()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Account;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nickname = this.getNickname();
        result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
        final Object $avatar = this.getAvatar();
        result = result * PRIME + ($avatar == null ? 43 : $avatar.hashCode());
        final Object $access_level = this.getAccess_level();
        result = result * PRIME + ($access_level == null ? 43 : $access_level.hashCode());
        result = result * PRIME + this.getUser_record_id();
        result = result * PRIME + this.getCart_id();
        return result;
    }

    public String toString() {
        return "Account(id=" + this.getId() + ", nickname=" + this.getNickname() + ", avatar=" + this.getAvatar() + ", access_level=" + this.getAccess_level() + ", user_record_id=" + this.getUser_record_id() + ", cart_id=" + this.getCart_id() + ")";
    }
}
