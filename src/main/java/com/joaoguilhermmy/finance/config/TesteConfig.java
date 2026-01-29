package com.joaoguilhermmy.finance.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaoguilhermmy.finance.entities.Expense;
import com.joaoguilhermmy.finance.entities.User;
import com.joaoguilhermmy.finance.repositories.ExpenseRepository;
import com.joaoguilhermmy.finance.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "alex@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Expense ex1 = new Expense(null, "McDonalds Combo", 45.90, Instant.parse("2026-01-20T19:53:07Z"), u1);
        Expense ex2 = new Expense(null, "Aluguel Janeiro", 1200.00, Instant.parse("2026-01-05T10:00:00Z"), u2);
        Expense ex3 = new Expense(null, "Academia", 90.00, Instant.parse("2026-01-28T08:30:00Z"), u1);
        Expense ex4 = new Expense(null, "Netflix", 55.90, Instant.parse("2026-01-28T20:00:00Z"), u2);

        expenseRepository.saveAll(Arrays.asList(ex1, ex2, ex3, ex4));
    }

}
