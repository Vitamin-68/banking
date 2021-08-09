package com.demo.banking.repository;

import com.demo.banking.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {

  List<Account> findByClientIn(Account account);
}
