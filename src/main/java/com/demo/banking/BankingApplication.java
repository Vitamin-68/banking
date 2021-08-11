package com.demo.banking;

import com.demo.banking.dao_service.AccountService;
import com.demo.banking.dao_service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

  @Autowired
  private ClientService clientServices;

  @Autowired
  private AccountService accountService;


  public static void main(String[] args) {
    SpringApplication.run(BankingApplication.class, args);
  }


}
