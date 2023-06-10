package com.example.filmStudio.repositories;


import com.example.filmStudio.models.Account;
import com.example.filmStudio.models.Film_info;
import com.example.filmStudio.models.User_record;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface RecordRepository extends JpaRepository<User_record, Long> {

    @Query(value = "SELECT * FROM user_record",
            nativeQuery = true)
    List<User_record> findAllRecords();



    @Query(value = "SELECT * FROM user_record WHERE user_record_id = :id",
            nativeQuery = true)
    List<User_record> findRecord(@Param("id") Long id);

    @Modifying
    @Query(value = "INSERT INTO account (fio, email, birthday, delivery_address, payment_address) VALUES" +
            " (:fio, :email, :birthday, :delivery_address, :payment_address)",
            nativeQuery = true)
    void createRecord(@Param("fio") String fio, @Param("email") String email, @Param("birthday") Date birthday,
                       @Param("delivery_address") String delivery_address, @Param("payment_address") String payment_address);


}
