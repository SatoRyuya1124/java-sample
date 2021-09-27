package com.example.demo.phistory.service;

import com.example.demo.phistory.model.User;
import com.example.demo.phistory.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public User postUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Autowired
    ProductRepository productRepository;

    public Product postProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Autowired
    HistoryRepository historyRepository;
    public History postHistory(History history) {
        return historyRepository.save(history);
    }

    public List<History> getHistory() {
        return historyRepository.findAll();
    }

}
