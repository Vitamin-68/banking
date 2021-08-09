package com.demo.banking.dto;

import com.demo.banking.entity.AccountType;
import com.demo.banking.entity.Client;
import lombok.Data;

@Data
public class AccountDto {

  private Integer id;
  private Long accountNum;
  private AccountType type;
  private Double balance;
  private Client client;
}
