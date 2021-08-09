package com.demo.banking.services;

import com.demo.banking.entity.Account;
import com.demo.banking.entity.Client;
import com.demo.banking.repository.AccountRepo;
import com.demo.banking.repository.ClientRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServices {

  @Autowired
  private final AccountRepo accountRepo;

  public AccountServices(AccountRepo accountRepo) {
    this.accountRepo = accountRepo;
  }

  public Account create(Account account) {
    accountRepo.save(account);
    return account;
  }

//  public List<Account> findAllClientId(Integer id) {
//    List<Account> la = accountRepo.findAllById(id);
//    return la;
//  }

  List<Account> findByClientIn(Integer id) {

    List<Account> accounts = accountRepo.findByClientIn(accountRepo.findById(1).get());
    return accounts;
  }

//  public Account update(Account account) {
//    Account updAccount = new Account();
//    Optional<Account> result = accountRepo.findById(account.getId());
//    if (result.isPresent()) {
//      accountRepo.save(account);
//      updAccount = account;
//    }
//    return updAccount;
//  }

  public Account delete(Account account) {
    Optional<Account> result = accountRepo.findById(account.getId());
    result.ifPresent(accountRepo::delete);
    return account;
  }

}
