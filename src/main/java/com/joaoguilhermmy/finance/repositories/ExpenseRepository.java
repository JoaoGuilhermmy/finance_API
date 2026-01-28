package com.joaoguilhermmy.finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoguilhermmy.finance.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
