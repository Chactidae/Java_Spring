package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_order")
@AllArgsConstructor
@NoArgsConstructor
public class User_order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_order_id")
    private Long id;
    @Column(name = "o_type")
    private String o_type;
    @Column(name = "o_name")
    private String o_name;
    @Column(name = "price")
    private int price;
    @Column(name = "film_id")
    private int film_id;


    public Long getId() {
        return this.id;
    }

    public String getO_type() {
        return this.o_type;
    }

    public String getO_name() {
        return this.o_name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getFilm_id() {
        return this.film_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setO_type(String o_type) {
        this.o_type = o_type;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User_order)) return false;
        final User_order other = (User_order) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$o_type = this.getO_type();
        final Object other$o_type = other.getO_type();
        if (this$o_type == null ? other$o_type != null : !this$o_type.equals(other$o_type)) return false;
        final Object this$o_name = this.getO_name();
        final Object other$o_name = other.getO_name();
        if (this$o_name == null ? other$o_name != null : !this$o_name.equals(other$o_name)) return false;
        if (this.getPrice() != other.getPrice()) return false;
        if (this.getFilm_id() != other.getFilm_id()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User_order;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $o_type = this.getO_type();
        result = result * PRIME + ($o_type == null ? 43 : $o_type.hashCode());
        final Object $o_name = this.getO_name();
        result = result * PRIME + ($o_name == null ? 43 : $o_name.hashCode());
        result = result * PRIME + this.getPrice();
        result = result * PRIME + this.getFilm_id();
        return result;
    }

    public String toString() {
        return "User_order(id=" + this.getId() + ", o_type=" + this.getO_type() + ", o_name=" + this.getO_name() + ", price=" + this.getPrice() + ", film_id=" + this.getFilm_id() + ")";
    }
}
