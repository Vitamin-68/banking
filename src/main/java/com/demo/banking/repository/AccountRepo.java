package com.demo.banking.repository;

import com.demo.banking.dao_entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {

//  List<Account> findByClientIn(Account account);
}
