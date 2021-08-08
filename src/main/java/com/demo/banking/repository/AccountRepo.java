package com.demo.banking.repository;

import com.demo.banking.entity.Account;
import com.demo.banking.entity.Client;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {

//  List<Account> findAllById(Integer id);

}
