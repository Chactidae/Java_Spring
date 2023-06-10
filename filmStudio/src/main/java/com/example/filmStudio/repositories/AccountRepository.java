package com.example.filmStudio.repositories;


import com.example.filmStudio.models.Account;
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
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "SELECT * FROM account",
            nativeQuery = true)
    List<Account> findAllAccounts();
    @Modifying
    @Query(value = "DELETE FROM account WHERE account.account_id = :id",
            nativeQuery = true)
    void deleteByIdAccount(@Param("id") Long id);

    @Modifying
    @Query(value = "INSERT INTO account (nickname, avatar, access_level, user_record_id, cart_id) VALUES" +
            " (:nickname, :avatar, :access_level, :user_record_id, :cart_id)",
            nativeQuery = true)
    void createAccount(@Param("nickname") String nickname, @Param("avatar") String avatar, @Param("access_level") String access_level, @Param("user_record_id") Integer user_record_id, @Param("cart_id") Integer cart_id);

}
