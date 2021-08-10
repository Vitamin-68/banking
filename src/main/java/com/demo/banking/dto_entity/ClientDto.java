package com.demo.banking.dto_entity;

import java.util.List;
import lombok.Data;

@Data
public class ClientDto {

  private Integer id;
  private String firstName;
  private String lastName;
  private List<AccountDto> listAccounts;
}
