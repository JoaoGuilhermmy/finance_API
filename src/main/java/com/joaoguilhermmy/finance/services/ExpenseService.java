package com.joaoguilhermmy.finance.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.joaoguilhermmy.finance.entities.Expense;
import com.joaoguilhermmy.finance.repositories.ExpenseRepository;
import com.joaoguilhermmy.finance.services.exception.DatabaseExcpition;
import com.joaoguilhermmy.finance.services.exception.ResourceNotFoundExcpetion;

import jakarta.persistence.EntityNotFoundException;

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

    public Expense insert(Expense obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundExcpetion(id);
        }

        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseExcpition(e.getMessage());
        }
    }

    public Expense update(Integer id, Expense expense) {
        try {
            Expense entity = repository.getReferenceById(id);
            updateData(entity, expense);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundExcpetion(id);
        }
    }

    private void updateData(Expense entity, Expense expense) {
        entity.setDescription(expense.getDescription());
        entity.setPrice(expense.getPrice());
        entity.setDate(expense.getDate());
    }

}
