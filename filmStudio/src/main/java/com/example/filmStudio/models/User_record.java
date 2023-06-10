package com.example.filmStudio.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "user_record")
@AllArgsConstructor
@NoArgsConstructor
public class User_record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_record_id")
    private Long id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "email")
    private String email;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "delivery_address")
    private String delivery_address;
    @Column(name = "payment_address")
    private String payment_address;

    public Long getId() {
        return this.id;
    }

    public String getFio() {
        return this.fio;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getDelivery_address() {
        return this.delivery_address;
    }

    public String getPayment_address() {
        return this.payment_address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public void setPayment_address(String payment_address) {
        this.payment_address = payment_address;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User_record)) return false;
        final User_record other = (User_record) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$fio = this.getFio();
        final Object other$fio = other.getFio();
        if (this$fio == null ? other$fio != null : !this$fio.equals(other$fio)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$birthday = this.getBirthday();
        final Object other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        final Object this$delivery_address = this.getDelivery_address();
        final Object other$delivery_address = other.getDelivery_address();
        if (this$delivery_address == null ? other$delivery_address != null : !this$delivery_address.equals(other$delivery_address))
            return false;
        final Object this$payment_address = this.getPayment_address();
        final Object other$payment_address = other.getPayment_address();
        if (this$payment_address == null ? other$payment_address != null : !this$payment_address.equals(other$payment_address))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User_record;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $fio = this.getFio();
        result = result * PRIME + ($fio == null ? 43 : $fio.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $birthday = this.getBirthday();
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        final Object $delivery_address = this.getDelivery_address();
        result = result * PRIME + ($delivery_address == null ? 43 : $delivery_address.hashCode());
        final Object $payment_address = this.getPayment_address();
        result = result * PRIME + ($payment_address == null ? 43 : $payment_address.hashCode());
        return result;
    }

    public String toString() {
        return "User_record(id=" + this.getId() + ", fio=" + this.getFio() + ", email=" + this.getEmail() + ", birthday=" + this.getBirthday() + ", delivery_address=" + this.getDelivery_address() + ", payment_address=" + this.getPayment_address() + ")";
    }
}
