package com.example.filmStudio.repositories;


import com.example.filmStudio.models.Review;
import com.example.filmStudio.models.User_order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<User_order, Long> {
    @Query(value = "SELECT * FROM user_order",
            nativeQuery = true)
    List<User_order> findAllOrder();

    @Query(value = "SELECT * FROM user_order ORDER BY price DESC",
            nativeQuery = true)
    List<User_order> findSortDESCAllOrder();

    @Query(value = "SELECT * FROM user_order ORDER BY price",
            nativeQuery = true)
    List<User_order> findSortASCAllOrder();

    @Modifying
    @Query(value = "INSERT INTO user_order (o_type, o_name, price, film_id) VALUES" +
            " (:o_type, :o_name, :price, :film_id)",
            nativeQuery = true)
    void createOrder(@Param("o_type") String o_type, @Param("o_name") String o_name, @Param("price") Integer price, @Param("film_id") Integer film_id);

    @Modifying
    @Query(value = "UPDATE user_order SET o_type = :o_type, o_name = :o_name, price = :price, film_id = :film_id WHERE user_order_id = :id",
            nativeQuery = true)
    void updateOrder(@Param("id") Long id, @Param("o_type") String o_type, @Param("o_name") String o_name, @Param("price") Integer price, @Param("film_id") Integer film_id);


}
