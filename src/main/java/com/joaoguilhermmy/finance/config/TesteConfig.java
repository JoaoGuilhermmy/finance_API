package com.joaoguilhermmy.finance.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaoguilhermmy.finance.entities.Expense;
import com.joaoguilhermmy.finance.repositories.ExpenseRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public void run(String... args) throws Exception {
        Expense ex1 = new Expense(null, "Lanche", 8.00, Instant.parse("2019-06-20T19:53:07Z"));
        Expense ex2 = new Expense(null, "Brinquedo", 196.48, Instant.parse("2019-06-20T19:53:07Z"));

        expenseRepository.saveAll(Arrays.asList(ex1, ex2));
    }

}
