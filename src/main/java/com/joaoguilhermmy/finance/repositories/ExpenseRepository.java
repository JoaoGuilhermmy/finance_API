package com.joaoguilhermmy.finance.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoguilhermmy.finance.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    List<Expense> findByUser_Id(Integer userId);
}
