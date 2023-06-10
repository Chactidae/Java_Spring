package com.example.filmStudio.services;

import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.User_order;
import com.example.filmStudio.repositories.AuthorRepository;
import com.example.filmStudio.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public List<User_order> list() {
        return orderRepository.findAllOrder();
    }
    public List<User_order> sortD() {
        return orderRepository.findSortDESCAllOrder();
    }
    public List<User_order> sort() {
        return orderRepository.findSortASCAllOrder();
    }
    public void createOrder(User_order user_order){
        orderRepository.createOrder(user_order.getO_type(), user_order.getO_name(), user_order.getPrice(), user_order.getFilm_id());
    }
    public User_order findById(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }

    public void updateOrder(User_order user_order, Long id){
        orderRepository.updateOrder(id, user_order.getO_type(), user_order.getO_name(), user_order.getPrice(), user_order.getFilm_id());
    }


}
