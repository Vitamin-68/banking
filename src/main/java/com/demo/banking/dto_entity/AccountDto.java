package com.demo.banking.dto_entity;

import com.demo.banking.dao_entity.AccountType;
import lombok.Data;

@Data
public class AccountDto {

  private Integer id;
  private String accountNum;
  private String accountType;
  private Double balance;
  private ClientDto client;
}
