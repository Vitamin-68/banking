package com.demo.banking.repository;

import com.demo.banking.dao_entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactRepo extends JpaRepository<Transaction, Integer> {

}
