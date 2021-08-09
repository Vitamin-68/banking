package com.demo.banking.dto;

import com.demo.banking.entity.Account;
import java.util.List;
import lombok.Data;

@Data
public class ClientDto {

  private Integer id;
  private String firstName;
  private String lastName;
  private List<Account> listAccounts;
}
