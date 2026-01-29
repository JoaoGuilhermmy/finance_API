package com.joaoguilhermmy.finance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoguilhermmy.finance.entities.User;
import com.joaoguilhermmy.finance.repositories.UserRepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
