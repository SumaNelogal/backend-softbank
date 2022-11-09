package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Transactions;

public interface TransactionsRepo extends JpaRepository<Transactions, Long> {

}
