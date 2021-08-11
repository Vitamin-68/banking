package com.demo.banking.dto_service;

import com.demo.banking.dao_service.AccountService;
import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.fasade.EntityConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountDtoService implements AccountDtoServiceImpl {

  private final EntityConverter converter;
  private final AccountService accountService;

  @Override
  public AccountDto findById(Integer id) {
    return converter.convertAccountToDto(accountService.findById(id));
  }

}
