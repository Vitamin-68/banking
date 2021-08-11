package com.demo.banking.dao_service;

import com.demo.banking.dao_entity.Transaction;
import com.demo.banking.repository.TransactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactService {

  @Autowired
  private final TransactRepo transactRepo;


  public TransactService(TransactRepo transactRepo) {
    this.transactRepo = transactRepo;
  }

  public Transaction create(Transaction transaction){
    transactRepo.save(transaction);
    return transaction;
  }
}
