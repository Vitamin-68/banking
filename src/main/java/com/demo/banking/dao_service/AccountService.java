package com.demo.banking.dao_service;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.repository.AccountRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  @Autowired
  private final AccountRepo accountRepo;

  public AccountService(AccountRepo accountRepo) {
    this.accountRepo = accountRepo;
  }

  public Account create(Account account) {
    accountRepo.save(account);
    return account;
  }

  public List<Account> create(List<Account> accounts) {
    accountRepo.saveAll(accounts);
    return accounts;
  }

  public Account findById(Integer id) {
    return accountRepo.findById(id).get();
  }

}
