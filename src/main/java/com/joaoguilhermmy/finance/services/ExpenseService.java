package com.joaoguilhermmy.finance.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoguilhermmy.finance.entities.Expense;
import com.joaoguilhermmy.finance.repositories.ExpenseRepository;
import com.joaoguilhermmy.finance.services.exception.ResourceNotFoundExcpetion;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> findAll() {
        return repository.findAll();
    }

    public Expense findById(Integer id) {
        Optional<Expense> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundExcpetion(id));
    }
}
